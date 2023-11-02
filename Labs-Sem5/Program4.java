import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the next double: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.printf("The sum of the numbers is: %.2f", (num1 + num2));
                break;
            case '-':
                System.out.printf("The subtraction of the numbers is: %.2f", (num1 - num2));
                break;
            case '*':
                System.out.printf("The multiplication of the number is: %.2f", (num1 * num2));
                break;
            case '/':
                System.out.printf("The answer is: %.2f", (num1 / num2));
                break;
            default:
                System.out.println("Wrong operator");
                break;
        }
    }
}
