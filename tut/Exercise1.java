public class Exercise1 {

    int abc; // instance variable

    static int sum(int a, int b) {

        return 0;
    }

    public static void main(String[] args) {
        // int double|float String Boolean char
        // int a = 5; // local variable
        // double b = 5.55;
        // String name = "bidyut";
        // boolean c = true;
        // char singleCharacter = 'k';

        // float d = 5.55f;// by default decimal point is stored in double

        // // conditional statement
        // // if and else
        // // falsy value = 0
        // // truthy value = 1
        // int res = sum(4, 5);
        // // if (res) {
        // // System.out.println(b);

        // // }
        // int age = 12;
        // // String drink;
        // // ternary operator
        // String drink = age > 18 ? "wine" : "water";
        // if (age > 18) {
        // drink = "wine";
        // } else {
        // drink = "water";
        // }
        // // System.out.println(drink);

        // array
        // 'a', 'b'
        // set of homogenous datatype
        // mutable = changable;
        // immutable = unchangable;
        // String name = "Bidyut"; // 2000
        // name = "kingshuk"; // 2020
        // String newName = name.toLowerCase();

        // Array
        // int[] kingshukArray = new int[10];
        // String className = kingshukArray.getClass().getName();
        // System.out.println(className);

        Exercise1 obj1 = new Exercise1();
        String newName1 = obj1.getClass().getName();
        System.out.println(newName1);

        // for (int i = 0; i < kingshukArray.length; i++) {
        // kingshukArray[i] = 5;
        // }

        int[] kingshukArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        double[] swarnaArray = { 4.44, 5.55, 6.66, };

        String[] bidyutArray = { "Bidyut", "Arnab", "Swarna", "Kingshuk", "Aashish" };

        // char[] arnabArray = { 111, 211, 111 };

        int[] newSpecialArray = { 'a', 'b', 'c' };

        for (int element : newSpecialArray) {
            System.out.println(element);
        }

        // loop
        for (int i = 0; i < 4; i += 2) {
            break;
            // continue;
        }
        int i = 0;

        // while entry control
        i = 5;
        while (i < 4) {

            i++;
        }

        // do while exit control
        i = 5;
        do {

        } while (i < 4);

        // foreach loop
        for (int element : newSpecialArray) {
            System.out.println(element);
        }
    }
}
