public class Program24 {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 4 }, { 7, 6, 7 } };
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 4 }, { 7, 6, 7 } };
        int[][] res = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
