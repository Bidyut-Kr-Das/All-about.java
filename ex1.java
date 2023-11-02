import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < (arr.length - 1); i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
