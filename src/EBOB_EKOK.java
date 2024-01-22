import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, i, EBOB = 1, EKOK = 1;

        System.out.print("Please enter a first number: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter a second number: ");
        secondNumber = input.nextInt();

        if (firstNumber <= secondNumber){
            for (i = 1; i <= firstNumber; i++){
                if (firstNumber % i == 0 && secondNumber % i == 0){
                    EBOB = i;
                }
            }
            System.out.println("EBOB: " + EBOB);

        }
        else if (secondNumber < firstNumber){
            for (i = 1; i <= secondNumber; i++){
                if (firstNumber % i == 0 && secondNumber % i == 0){
                    EBOB = i;
                }
            }
            System.out.println("EBOB: " + EBOB);
        }

            for (i = 1; i <= (firstNumber * secondNumber); i++){
                if (i % firstNumber == 0 && i % secondNumber == 0){
                    EKOK = i;
                    break;
                }
            }
            System.out.println("EKOK: " + EKOK );

    }
}
