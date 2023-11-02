import java.util.Scanner;
public class exercise3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int result1,result2,position;
        char oldchar;
        String sentence;
        System.out.print("Enter the sentence: ");
        sentence=sc.nextLine();
        System.out.print("Enter the position: ");
        position=sc.nextInt();
        oldchar=sentence.charAt(position);
        result2=sentence.codePointAt(position);
        position--;
        char newchar=sentence.charAt(position);
        result1=sentence.codePointAt(position);

        System.out.println("the unicode value of "+oldchar+ " is "+result2);
        System.out.println("the unicode value of previous character "+newchar+" is "+result1);
    }
    
}
