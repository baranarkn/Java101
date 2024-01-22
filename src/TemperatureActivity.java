import java.util.Scanner;

public class TemperatureActivity {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature: ");
        temperature = input.nextInt();
        if (temperature < 5){
            System.out.println("I recommend skiing.");
        }
        else if(temperature >= 5 && temperature <= 15){
            System.out.println("I recommend going to the movies.");
        }
        else if (temperature > 15 && temperature <= 25){
            System.out.println("I recommend going to the picnic.");
        }
        else if (temperature > 25){
            System.out.println("I recommend swimming.");
        }

    }
}
