import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of paper: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100)
            System.out.printf("The total price for %d pages is: %.2f", number, (number * 0.30));
        else if (number > 99 && number < 500)
            System.out.printf("The total price for %d pages is: %.2f", number, (number * 0.28));
        else if (number > 499 && number < 800)
            System.out.printf("The total price for %d pages is: %.2f", number, (number * 0.27));
        else if (number > 799 && number < 1000)
            System.out.printf("The total price for %d pages is: %.2f", number, (number * 0.26));
        else if (number > 1000)
            System.out.printf("The total price for %d pages is: %.2f", number, (number * 0.25));
        else
            System.out.println("Invalid number of papers.");

    }
}
