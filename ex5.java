import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        max = arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i!=0&&i!=3) {
                    if (j!=0&&j!=3) {
                        continue;
                    } else {
                        System.out.println("printing arr[" + i + "][" + j + "]");
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                    }
                } else {
                    System.out.println("printing arr[" + i + "][" + j + "]");
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}