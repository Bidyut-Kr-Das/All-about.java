import java.util.*;
public class exercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence;
        int position1,position2, result;
        System.out.print("Enter your sentence: ");
        sentence= sc.nextLine();
        System.out.print("Enter first position: ");
        position1 = sc.nextInt();
        System.out.print("Enter second position: ");
        position2=sc.nextInt();
        result=sentence.codePointCount(position1, position2);
        //codePointCount returns the number of unicode value present
        //in the range starting to end-1
        System.out.println("The number of Unicode value present in this range is "+result);
    }
    
}
