import java.util.Scanner;

public class Program3 {
    public static void calcArea(double l, double b) {
        double area = l * b;
        System.out.println("The area of rectangle is: " + area);
    }

    public static void calcPeri(double l, double b) {
        double peri = 2 * (l + b);
        System.out.println("The perimeter of Rectangle is: " + peri);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of triangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of triangle: ");
        double breadth = sc.nextDouble();
        calcArea(length, breadth);
        calcPeri(length, breadth);
    }
}
