public class Program36 {
    public static void fun2(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: " + a.length);
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fun2("ABC", 100, 200);
        fun2("JAVA", 1, 2, 3, 4, 5);
        fun2("OOPs");
    }
}
