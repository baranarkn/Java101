import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.print("Body Mass Index: " + bodyMassIndex);
    }
}
