import java.util.Scanner;

public class Program16 {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("After sorting the array.");
        bubbleSort(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

}
