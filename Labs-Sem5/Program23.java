public class Program23 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);
    }
}
