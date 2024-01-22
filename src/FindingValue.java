import java.util.Scanner;

public class FindingValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber, maxNumber, number;

        System.out.print("Enter the number of numbers you want to enter:");
        int num = input.nextInt();

        System.out.print("Please enter the 1. number: ");
        number = input.nextInt();
        maxNumber = number;
        minNumber = number;

        for (int i = 2; i <= num; i++){
            System.out.print("Please enter the " + i + ". number: ");
            number = input.nextInt();
            if (number > maxNumber){
                maxNumber = number;
            }
            if (number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Min Number: " + minNumber);
        System.out.println("Max Number: " + maxNumber);
    }
}
