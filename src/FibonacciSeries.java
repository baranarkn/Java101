import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element, i;

        System.out.print("How many elements do you want a Fibonacci series: ");
        element = input.nextInt();
        System.out.println("Fibonacci Series: ");

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber + " " + secondNumber + " ");

        for (i = 2; i < element; i++){
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        input.close();
    }
}
