import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.print("Number of digits: ");
        digit = input.nextInt();

        for (int i = digit; i >= 1; i--) {
            for (int j = 0; j < digit - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
