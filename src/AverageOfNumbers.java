import java.util.Scanner;

public class AverageOfNumbers {
    //Program that calculates the average of numbers divisible by 3 and 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        System.out.print("Please enter a number:");
        int i = input.nextInt();
        for (int k = 0; k <=i; k++){
            if (k % 3 == 0 || k % 4 == 0){
                sum = sum + k;
                number++;
            }

        }
        double average = sum / number;
        System.out.println("Average: " + average);
    }
}
