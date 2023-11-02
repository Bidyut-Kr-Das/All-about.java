import java.util.*;

public class taking_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //byte a=sc.nextByte();
        System.out.print("enter your first number: ");
        int a = sc.nextInt();
        System.out.print("enter your second number: ");
        int b = sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
        sc.close();
        
        // boolean bi = sc.hasNextInt()
        System.out.println("the sum of 2 input is");

    }
}

