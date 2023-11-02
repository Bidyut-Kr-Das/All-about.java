import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        System.out.println("The sum of the number is: "+sum);
    }
}
