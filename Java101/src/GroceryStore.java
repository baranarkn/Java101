import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Kilos of Pear: ");
        double pear = input.nextDouble();
        double pearPrice = pear * 2.14;
        System.out.print("How Many Kilos of Apple: ");
        double apple = input.nextDouble();
        double applePrice = apple * 3.67;
        System.out.print("How Many Kilos of Tomato: ");
        double tomato = input.nextDouble();
        double tomatoPrice = tomato * 1.11;
        System.out.print("How Many Kilos of Banana: ");
        double banana = input.nextDouble();
        double bananaPrice = banana * 0.95;
        System.out.print("How Many Kilos of Aubergine: ");
        double aubergine = input.nextDouble();
        double auberginePrice = aubergine * 5.00;

        double total = pearPrice + applePrice + tomatoPrice + bananaPrice + auberginePrice;
        System.out.print("Total Amount: " + total + " €");

    }
}
