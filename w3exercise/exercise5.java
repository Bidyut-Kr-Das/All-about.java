import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence1,sentence2;
        int result;
        System.out.print("Enter first String: ");
        sentence1=sc.nextLine();
        System.out.print("Enter second String: ");
        sentence2=sc.nextLine();
        // result=sentence1.compareTo(sentence2);
        // System.out.println(result);
        if(sentence1.compareTo(sentence2)==0){
            System.out.println("Both Strings are equal.");

        }
        else{
            if(sentence1.compareTo(sentence2)>0){
                System.out.println("First String is Greater than second string");
            }
            else{
                System.out.println("First string is less than second string.");
            }
        }

    }
}
