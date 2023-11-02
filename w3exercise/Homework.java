import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1, str = "", revstr = "", newstring = "", newrevstring = "";
        int i, l;
        System.out.print("Enter the sentence: ");
        string1 = sc.nextLine();
        l = string1.length();

        for (i = 0; i < l; i++) {
            char ch = string1.charAt(i);
            // String newStr=String.valueOf(ch);
            if (ch == ' ') {
                newstring = str + ch + newstring;
                newrevstring = newrevstring + ch + revstr;
                str = "";
                revstr = "";

            } else {
                str = str + ch;
                revstr = ch + revstr;
            }

        }
        newstring = str + " " + newstring;
        newrevstring = newrevstring + " " + revstr;
        System.out.println(newstring);
        newrevstring = newrevstring.trim();
        System.out.println(newrevstring);
        sc.close();
    }
}
