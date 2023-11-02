class LibraryManagement {
    private String mc;
    private int mid;
    private String dept;
    private int noOfBook;

    public void getter(String a, int b, String c, int no) {
        this.mc = a;
        this.mid = b;
        this.dept = c;
        this.noOfBook = no;
    }

    public void borrowBook(int no) {
        noOfBook -= no;
        System.out.println(noOfBook + " After Book borrowed");
    }

    public void returnBook(int no) {
        noOfBook += no;
        System.out.println(noOfBook + " After Book withdraw.");
    }

    public void setter() {
        System.out.println("member category " + mc);
        System.out.println("department is " + dept);
        System.out.println("no of book now have in library " + noOfBook);
    }

}

public class Program12 {
    public static void main(String[] args) {
        LibraryManagement obj = new LibraryManagement();
        obj.getter("AP", 1001, "CSE", 10);
        obj.setter();
        obj.borrowBook(2);
        obj.setter();
        obj.returnBook(1);
        obj.setter();
    }
}
