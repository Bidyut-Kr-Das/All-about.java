import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String sent1, sent2;
        System.out.print("Enter first String:");
        sent1=sc.nextLine();
        System.out.print("Enter second String:");
        sent2=sc.nextLine();
        int result=sent1.compareToIgnoreCase(sent2);
        if(result==0){
            System.out.println("both are same");

        }
        else{
            if(result<0){
                System.out.println("First string is less than second string "+result);
            }
            else{
                System.out.println("First string is greater than second string "+result);
            }
        }
    }
}
