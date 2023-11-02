
public class Functions {
    // |void|<- is called return type of a function
    void swap(int[] arr1, int index1, int index2) {
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
        // var1 = a = 5
        // System.out.println("a = " + var1 + ", b = " + var2);

    }
    // static is a property of class
    // without static keyword you need to create an object to call the function
    //

    public static void main(String[] args) {
        // int a = 5;
        // int b = 6;
        // int kingshuk = 69;

        // Functions obj12 = new Functions();
        // obj12.swap(a, b);
        // int var1 = c = 7;

        // obj12.swap(a, kingshuk);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; // 2000 arr = 2000
                                                      // arr1 = 2000

        // int[] arr = new int[size]; size = no of elements

        // object without name is called anonymous object
        new Functions().swap(arr, 1, 8);
        for (int element : arr) {
            System.out.print(element + " ");
        }
        new Functions().swap(arr, 1, 8);
        System.out.println();
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}