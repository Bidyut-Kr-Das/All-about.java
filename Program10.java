import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        // Program to print the fibonacci series within the given range
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int noOfEle = sc.nextInt();
        System.out.print("0 1 ");
        int a = 0, b = 1, sum = a + b;
        for (int i = 2; i < noOfEle; i++) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }
    }
}
