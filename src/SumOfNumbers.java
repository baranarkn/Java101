import java.util.Scanner;

public class SumOfNumbers {
    //Program that adds even numbers and multiples of 4 from the entered values and prints them on the screen.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Please input a number: ");
            number = input.nextInt();
            if (number % 2 == 0 || number % 4 == 0){
                sum += number;


            }
        }
        while (number % 2 == 0);
        System.out.println("Sum: " + sum);
    }
}
