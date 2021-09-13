package Program198.java;
import java.util.Scanner;

/*
1 1 1 1 1
3       3
5       5
7       7
9 9 9 9 9
*/
class Pattern
{
    void Display(int iRow, int iCol)
    {
        int x = 1;
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if ((i == iRow) || (i == 1) || (j == 1) || (j == iCol))
                {
                    System.out.print(x + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            x = x + 2;
        }
    }
}

public class Program198
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int no1 = sobj.nextInt();

        System.out.println("Enter Number of Columns");
        int no2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(no1,no2);
    }
}
