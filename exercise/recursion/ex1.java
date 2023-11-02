
// Write a Java recursive method to calculate the factorial of a given positive integer.
import java.util.Scanner;

public class ex1 {
    static int fact(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int number = sc.nextInt();

        int res = fact(number);
        System.out.println(res);
        sc.close();
    }
}
