import java.util.Scanner;

public class SumDigits {
    //Program that calculates the sum of the digits of a number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        int digitNumber;
        int result = 0;

        while (number != 0){
            digitNumber = number % 10;
            result += digitNumber;
            number /= 10;
        }
        System.out.println("Result: " + result);
    }
}
