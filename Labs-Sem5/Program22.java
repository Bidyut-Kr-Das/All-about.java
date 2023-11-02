import java.util.Scanner;

public class Program22 {
    public static void binarySearch(int number, int[] arr) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (number == arr[mid]) {
                System.out.println("The number is in " + mid + " position.");
                return;
            } else if (number < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("The number is not present in the array.");
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int number = sc.nextInt();
        binarySearch(number, arr);
    }
}
