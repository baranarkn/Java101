import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int number1, number2, select;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = input.nextInt();
        System.out.println("Please select a transaction.");
        System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 / number2);
                break;
            case 4:
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("You selected wrong number. Please select 1 to 4.");
        }
    }
}
