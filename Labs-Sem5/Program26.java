public class Program26 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 2 }, { 5, 6, 4 }, { 6, 7, 4 } };
        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The boundary elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == (arr.length - 1) || j == (arr[i].length - 1))
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
}
