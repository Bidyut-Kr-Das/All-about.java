import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, tempNumber, j = 0;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            tempNumber = number;
            int freq = 0;
            while (tempNumber != 0) {
                int rem = tempNumber % 10;
                if (rem == i) {
                    freq++;
                    if (freq > 1) {
                        System.out.println("The number " + number + " is not an unique number");
                        break;

                    }
                }
                tempNumber /= 10;
            }
            j = i + 1;
        }
        if (j == 9) {
            System.out.println("The number " + number + " is an unique number");
        }

    }
}
