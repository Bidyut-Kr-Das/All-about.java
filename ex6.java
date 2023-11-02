import java.util.Scanner;

public class ex6
{
    public static void main(String args[])
    {
        int row=0,col=0,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        row=sc.nextInt();
        System.out.print("Enter no.of columns: ");
        col=sc.nextInt();
        int ar[][]=new int[row][col];
        System.out.println("Enter matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        max=ar[0][0];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0||i==row-1||j==0||j==col-1)
                {
                    if(ar[i][j]>max)
                    {
                        max=ar[i][j];
                    }
                }
            }
        }
        System.out.println("Maximum of boundary elements is "+max);
    }
}}

}
