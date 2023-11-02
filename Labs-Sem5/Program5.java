import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();
        double temp = (a > b) ? a : b;
        double largest = (temp < c) ? c : temp;
        System.out.println("The largest number is: " + largest);
    }
}
