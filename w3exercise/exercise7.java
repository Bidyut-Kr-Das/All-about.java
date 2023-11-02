import java.util.Scanner;
public class exercise7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String string1, string2;
        string1= sc.nextLine();
        string2= sc.nextLine();
        String newstring= string1+" "+ string2;
        System.out.println(newstring);
    }
}
