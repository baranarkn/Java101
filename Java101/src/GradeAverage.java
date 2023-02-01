import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Math grade: ");
        int math = input.nextInt();
        System.out.print("Please enter Physics grade: ");
        int physics = input.nextInt();
        System.out.print("Please enter Turkish grade: ");
        int turkish = input.nextInt();
        System.out.print("Please enter Chemistry grade: ");
        int chemistry = input.nextInt();
        System.out.print("Please enter History grade: ");
        int history = input.nextInt();
        System.out.print("Please enter Music grade: ");
        int music = input.nextInt();

        double average = (math+physics+turkish+chemistry+history+music)/6;
        System.out.println("Grade Average: " +average);
        if(average > 60){
            System.out.println("Passed the Class");
        }
        else{
            System.out.println("Failed the Class");
        }
    }
}
