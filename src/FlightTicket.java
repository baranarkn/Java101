import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance in kilometers: ");
        int distance = input.nextInt();

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.print("Please enter the type of trip (1 => One Way, 2 => Round Trip): ");
        int choice = input.nextInt();

        if(distance <= 0){
            System.out.println("You Have Entered Wrong Data!");
        }
        if(age <= 0){
            System.out.println("You Have Entered Wrong Data!");
        }
        if(!(choice == 1 || choice == 2)){
            System.out.println("You Have Entered Wrong Data!");
        }

        double normalAmount = distance * (0.10);
        double ageDiscount = 0;
        double outboundTicketDiscount;
        double totalAmount = 0;
        if (age < 12){
             ageDiscount = normalAmount * (0.50);
        }
        else if (age >= 12 && age <= 24){
             ageDiscount = normalAmount * (0.10);
        }
        else if (age > 65){
            ageDiscount = normalAmount * (0.30);
        }

        double discountedAmount = normalAmount - ageDiscount;
        if(choice == 2){
            outboundTicketDiscount = discountedAmount * (0.20);
            totalAmount = (discountedAmount - outboundTicketDiscount) * 2;
        }
        else if (choice == 1){
            totalAmount = discountedAmount;
        }
        System.out.println("Total Amount: " + totalAmount + " TL");
    }
}
