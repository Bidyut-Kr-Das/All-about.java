import java.util.Scanner;

public class Program15 {
    public static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no " + i + ":\t");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
        int res = search(arr, num);
        if (res == 0)
            System.out.println("The number is not present in the array.");
        else {
            System.out.println("The number is present in " + (res + 1) + " position");
        }

    }
}
