import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first right side of the triangle: ");
        int firstTriangle = input.nextInt();
        System.out.print("Please enter the second right side of the triangle: ");
        int secondTriangle = input.nextInt();
        double hypotenuse = Math.sqrt((firstTriangle*firstTriangle)+(secondTriangle*secondTriangle));
        System.out.print("Hypotenuse: " +hypotenuse);
        System.out.println();
        double u = (firstTriangle+secondTriangle+hypotenuse)/2;
        double area = Math.sqrt(u*(u-firstTriangle)*(u-secondTriangle)*(u-hypotenuse));
        System.out.println("Area of the Triangle: "+area);
    }
}
