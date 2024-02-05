import java.util.Arrays;
import java.util.Scanner;

public class ShortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the size of the array: ");
        n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i < n; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("Your array before sorting from smallest to largest: ");
        System.out.print("[");
        for (int i=0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");

        Arrays.sort(numbers);
        System.out.println();

        System.out.println("Your array after sorting from smallest to largest: ");
        System.out.print("[");
        for (int i=0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");
    }
}
