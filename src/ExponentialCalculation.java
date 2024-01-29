import java.util.Scanner;

public class ExponentialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, exponentNumber;

        System.out.print("Please enter base value: ");
        baseNumber = input.nextInt();
        System.out.print("Please enter exponent value: ");
        exponentNumber = input.nextInt();
        if (exponentNumber < 0 ){
            System.out.println("Please enter the positive exponent value.");
        }else {
            System.out.print(baseNumber + " ^ " + exponentNumber + " = " + exponential(baseNumber,exponentNumber));
        }
    }

    public static int exponential(int baseNumber, int exponentNumber) {
        if (exponentNumber == 0) {
            return 1;
        } else {
            return exponential(baseNumber, exponentNumber-1) * baseNumber;
        }
    }
}
