import java.util.Scanner;

public class PowerOfNumber {
    //Program that prints the powers of 4 and 5 up to the entered number on the screen.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        int i;
        for (i = 1; i <= number; i *= 4) {
            System.out.println("Powers of 4: " + i);
        }
        System.out.println("-------------------------------");
        for (i = 1; i <= number; i *= 5) {
            System.out.println("Powers of 5: " + i);
        }
    }
}
