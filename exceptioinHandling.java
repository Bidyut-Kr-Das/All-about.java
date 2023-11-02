class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class exceptioinHandling {

    public static void main(String[] args) {
        try {
            // int c = 4 / 0;
            // int a = 5, b = 0;
            // if (b == 0) {

            // throw new Exception("cannot divide any number by zero");
            // }
            int c = 4 / 0;
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("The code is carrying on....");
    }
}
