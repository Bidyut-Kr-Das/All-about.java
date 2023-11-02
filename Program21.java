public class Program21 {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 2, 4, 5, 3, 6, 9, 8, 0 };
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
