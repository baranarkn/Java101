import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("--------------------------------------");
            System.out.println("1- Collection Process \n" + "2- Removal Process \n" + "3- Multiplication Operation \n" + "4- Division process \n"
                    + "5- Exponent Number Calculation\n" + "6- Getting Mode \n" + "7- Rectangular Area and Perimeter Calculation \n"
                    + "8- Exit");
            System.out.println("--------------------------------------");
            int chooice = input.nextInt();
            if (chooice == 8){
                System.out.println("Signing Out...");
                break;
            }
                System.out.print("Please select 1st number for transaction: ");
                int number1 = input.nextInt();
                System.out.print("Please select 2nd number for transaction: ");
                int number2 = input.nextInt();

            switch (chooice){
                case 1:
                    System.out.println("Answer: " + collection(number1,number2));
                    break;
                case 2:
                    System.out.println("Answer: " +removal(number1,number2));
                    break;
                case 3:
                    System.out.println("Answer: " +multiplication(number1,number2));
                    break;
                case 4:
                    System.out.println("Answer: " +division(number1,number2));
                    break;
                case 5:
                    System.out.println("Answer: " +exponent(number1,number2));
                    break;
                case 6:
                    System.out.println("Answer: " +mode(number1,number2));
                    break;
                case 7:
                    rectangular(number1,number2);
                    break;
                default:
                    System.out.println("You made the wrong choice. Please choose a number between 1 and 8");
                    break;
            }

        }

    }

    static int collection(int number1, int number2){
        return number1 + number2;
    }

    static int removal(int number1, int number2){
        return number1 - number2;
    }

    static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    static int division(int number1, int number2){
        return number1 / number2;
    }

    static int exponent(int number1, int number2){
        int tempResult = 1, i;
        for (i = 1 ; i <= number2 ; i++){
            tempResult *= number1;
        }
        return tempResult;
    }

    static int mode(int number1, int number2){
        return number1 % number2;
    }

    static void rectangular(int number1, int number2){
        System.out.println("Area: " + (number1 * number2));
        System.out.println("Perimeter: " + 2 * (number1 + number2));
    }
}
