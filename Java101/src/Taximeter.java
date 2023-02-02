import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance to travel: ");
        int distance = input.nextInt();

        double amount = 10 + (2.20 * distance);
        if(amount <= 20){
            amount = 20;
            System.out.print("Your fee: " +amount + " €");
        }
        else {
            System.out.println("Your fee: " +amount + " €");
        }
    }
}
