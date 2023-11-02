import java.util.Scanner;

public class percentage_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full marks of papers: ");
        float total_marks = sc.nextFloat();
        System.out.print("Enter subject 1 number: ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter subject 2 number: ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter subject 3 number: ");
        float sub3 = sc.nextFloat();
        float percentage = (sub1 + sub2 + sub3) * 100 / (total_marks * 3);
        System.out.println("the percentage is: " + percentage);
        sc.close();
    }

}
