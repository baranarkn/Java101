import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.print("Area of the Circle: " + area);
        System.out.println();
        double circumference = 2 * 3.14 * radius;
        System.out.print("Circumference of the Circle: " + circumference);
        System.out.println();
        System.out.print("Please enter the center angle of the circle segment: ");
        double angle = input.nextDouble();
        double segmentArea = (3.14 * (radius * radius) * angle) / 360;
        System.out.print("Area of the Circle Segment: " + segmentArea);
    }
}
