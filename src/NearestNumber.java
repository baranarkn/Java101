import java.util.Scanner;

public class NearestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the list: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            numbers[i] = input.nextInt();
        }
        System.out.print("[ ");
        for (int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Enter the number you want to find the closest values to: ");
        int number = input.nextInt();
        int closestMin = numbers[0];
        int closestMax = numbers[0];

        for (int i=0; i < n; i++){
            if (numbers[i] < number && Math.abs(numbers[i] - number) < Math.abs(closestMin - number) ){
                closestMin = numbers[i];
            }
            if (numbers[i] > number && Math.abs(numbers[i] - number) < Math.abs(closestMax - number)){
                closestMax = numbers[i];
            }
        }
        System.out.print("Nearest number less than the entered number: " + closestMin);
        System.out.println();
        System.out.print("Nearest number greater than the entered number: " + closestMax);
    }
}
