import java.util.Scanner;

public class ArmstrongNumber {
    /* If the sum of the nth powers of the digits of an n-digit number is equal to the number itself,
    such numbers are called Armstrong numbers.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        int digitNumber = 0;
        int tempNumber = number;
        int digitValue;
        int powerValue;
        int powerResult = 0;

        while (tempNumber != 0){
            tempNumber /= 10;
            digitNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            digitValue = tempNumber % 10;
            powerValue = 1;
            for (int i = 1; i <= digitNumber; i++){
                powerValue *= digitValue;
            }
            powerResult += powerValue;
            tempNumber /= 10;
        }
        if (powerResult == number){
            System.out.print(number + " is a Armstrong Number.");
        }
        else {
            System.out.print(number + " is not a Armstrong Number.");
        }
    }
}
