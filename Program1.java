import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a and b is: " + a + " " + b);
    }
}
