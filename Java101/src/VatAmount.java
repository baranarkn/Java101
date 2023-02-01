import java.util.Scanner;

public class VatAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Amount: ");
        int amount = input.nextInt();

        double vatAmount = amount + (amount * 0.18);
        System.out.print("Amount with VAT: " +vatAmount);
        System.out.println();
        double vatAmount2 = amount * 0.18;
        System.out.print("VAT Amount: " +vatAmount2);
    }
}
