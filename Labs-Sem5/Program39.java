import java.util.Scanner;

abstract class Shape {
    public abstract void rectangleArea(double length, double width);

    public abstract void squareArea(double side);

    public abstract void circleArea(double radius);
}

class Area extends Shape {
    @Override
    public void rectangleArea(double length, double width) {
        System.out.printf("Rectangle area = %.2f", length * width);
        System.out.println();
    }

    @Override
    public void squareArea(double side) {
        System.out.printf("Square area = %.2f", Math.pow(side, 2));
        System.out.println();
    }

    @Override
    public void circleArea(double radius) {
        System.out.printf("Circle area = %.2f", Math.PI * Math.pow(radius, 2));
        System.out.println();
    }
}

public class Program39 {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth for Rectangle: ");
        double breadth = sc.nextDouble();
        area.rectangleArea(length, breadth);

        System.out.print("Enter breadth for square: ");
        double side = sc.nextDouble();
        area.squareArea(side);

        System.out.print("Enter breadth for circle: ");
        double radius = sc.nextDouble();
        area.circleArea(radius);
    }
}
