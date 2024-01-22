import java.util.Scanner;

public class ExponentialNumbers {
    //Program that calculates exponential numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        System.out.print("Please enter the number to be the base: ");
        int n = input.nextInt();
        System.out.print("Please enter the number to be the power: ");
        int r = input.nextInt();
        for (int i = 1; i <= r; i++){
            total *= n;
        }
        System.out.print("Exponential Value: " + total);
    }
}
