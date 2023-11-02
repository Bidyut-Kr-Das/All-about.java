import java.util.Scanner;

public class Program6 {
    static void isPalindrome(char[] chArr) {
        int start = 0, end = chArr.length - 1;
        while (start < end) {
            if (chArr[start] != chArr[end]) {
                System.out.println("The number is not palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The number is palindrome.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String query = sc.nextLine();
        char[] chArr = query.toCharArray();
        isPalindrome(chArr);
    }
}
