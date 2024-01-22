import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please input first number: ");
        number1 = input.nextInt();
        System.out.println("Please input second number: ");
        number2 = input.nextInt();
        System.out.println("Please input third number: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            if (number2 > number3){
                System.out.println(number3 + "<" + number2 + "<" + number1);
            }
            else {
                System.out.println(number2 + "<" + number3 + "<" + number1);
            }
        }
        else if(number2 > number1 && number2 > number3){
            if (number1 > number3){
                System.out.println(number3 + "<" + number1 + "<" + number2);
            }
            else {
                System.out.println(number1 + "<" + number3 + "<" + number2);
            }
        }
        else if (number3 > number1 && number3 > number2){
            if (number2 > number1){
                System.out.println(number1 + "<" + number2 + "<" + number3);
            }
            else {
                System.out.println(number2 + "<" + number1 + "<" + number3);
            }
        }
    }
}
