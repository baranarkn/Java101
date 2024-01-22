import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,i, total=0;

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        for (i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        if (number == total){
            System.out.println(number + " is a perfect number.");
        }
        else {
            System.out.println(number + " is a not perfect number.");
        }
    }
}
