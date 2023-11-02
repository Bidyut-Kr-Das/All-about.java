import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("root1: " + root1);
            System.out.println("root2: " + root2);
        } else if (d == 0) {
            double root1 = -b / (2 * a);
            double root2 = -b / (2 * a);
            System.out.println("root1: " + root1);
            System.out.println("root2: " + root2);
        } else {
            double real = -b / (2 * a);
            double img = Math.sqrt((-d) / (2 * a));
            System.out.format("root1 = %.2f + %.2fi", real, img);
            System.out.format("root2 = %.2f - %.2fi", real, img);
        }

    }
}
