//variable arguments
public class Program35 {
    public static void fun(int... a) {
        System.out.println("Number of arguments: " + a.length);
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fun(100);
        fun(1, 2, 3, 4);
        fun();
    }
}
