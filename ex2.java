import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After right Shift");
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
