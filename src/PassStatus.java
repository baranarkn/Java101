import java.util.Scanner;

public class PassStatus {
    public static void main(String[] args) {
        int maths, physics, english, chemical, music, total = 0, totalNumber = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Maths Grade: ");
        maths = input.nextInt();
        if (maths >= 0 && maths <= 100) {
            total += maths;
            totalNumber++;
        }

        System.out.print("Physics Grade: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            totalNumber++;
        }

        System.out.print("English Grade: ");
        english = input.nextInt();
        if (english >= 0 && english <= 100) {
            total += english;
            totalNumber++;
        }

        System.out.print("Chemical Grade: ");
        chemical = input.nextInt();
        if (chemical >= 0 && chemical <= 100) {
            total += chemical;
            totalNumber++;
        }

        System.out.print("Music Grade: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            totalNumber++;
        }

        average = total / totalNumber;
        if (average > 55 ){
            System.out.println("Average: " + average);
            System.out.println("You have successfully passed the class.");
        }
        else {
            System.out.println("Average: " + average);
            System.out.println("You failed the class. See you next year.");
        }
    }
}
