public class ex4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = 123, r, flag = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = 0;
        }
        while (n > 0) {
            r = n % 10;
            ++a[r];
            n = n / 10;
        }

        for (int i = 0; i < 9; i++) {
            if (a[i] > 1) {
                flag = 1;
                System.out.println("not unique");
                break;
            }

        }
        if (flag == 0)

            System.out.println("unique");
    }
}