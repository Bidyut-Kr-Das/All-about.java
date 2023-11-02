
// Write a Java recursive method to calculate the nth Fibonacci number.
import java.util.Scanner;

public class ex3 {
    static void fibonacci(int range, int a, int b) {
        if (range == 1) {
            System.out.print(a + b);
        } else {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            fibonacci(range - 1, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of fibonacci series to print: ");
        int number = sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        fibonacci(number - 2, 0, 1);

    }
}
