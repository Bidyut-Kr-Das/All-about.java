import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) / 9 * 5;
        System.out.format("The temperature in Celsius is: %.2f", c);
    }
}
