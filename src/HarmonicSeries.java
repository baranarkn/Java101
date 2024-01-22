import java.util.Scanner;

public class HarmonicSeries {
    //Program to find the harmonic series of the entered number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        double result = 0;

        for (int i = 1; i <= number; i++){
        result += 1.0 / i;
        }
        System.out.println("Result: " + result);
    }
}
