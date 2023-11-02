
/*Write a Java recursive method to calculate the sum of all numbers from 1 to n. */
import java.util.Scanner;

public class ex2 {
    static int sum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + sum(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find sum: ");
        int number = sc.nextInt();
        int res = sum(number);
        System.out.println(res);

    }
}
