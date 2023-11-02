import java.util.Scanner;

public class Program9 {
    public static int isPrime(int number) {
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0 && i != 1)
                return -1;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the higher range: ");
        int higherRange = sc.nextInt();
        System.out.println("The prime numbers are: ");
        for (int i = lowerRange; i <= higherRange; i++) {
            int res = isPrime(i);
            if (res != -1) {
                System.out.print(i + " ");
            }
        }
    }
}
