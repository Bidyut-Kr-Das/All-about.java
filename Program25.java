public class Program25 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 3, 5 }, { 7, 5, 6 } };
        int[][] trans = new int[3][3];
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
