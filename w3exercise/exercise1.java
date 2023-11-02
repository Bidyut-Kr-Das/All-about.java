import java.util.Scanner;
public class exercise1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence;
        byte position;
        char letter;
        System.out.printf("Enter your sentence: ");
        sentence=sc.nextLine();
        System.out.print("Enter the position:");
        position=sc.nextByte();
        letter=sentence.charAt(position);  //returns ASCII value of the letter
        System.out.println("the letter at position "+position+" is "+letter);

        //str=""
        // word
        //i=0 -> w
        //str=""+w ->str="w"
        //i=1 -> o
        //str="w"+o ->str="wo"
        //st=toUpperCase(st)
        //A=!a
        //
    }
}