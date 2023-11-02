import java.security.DrbgParameters.NextBytes;
import java.util.*;
public class exercise2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String sentence;
        int result;
        byte position;
        System.out.print("Enter your sentence: ");
        sentence=sc.nextLine();
        System.out.print("Enter the position: ");
        position=sc.nextByte();
        result=sentence.codePointAt(position);//codePointAt returns integer unicodevalue
        System.out.println(result);

        
    }
}
