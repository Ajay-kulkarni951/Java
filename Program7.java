package Program196.java;
import java.util.Scanner;

public class Program196
{
    static int Addition(int iValue1, int iValue2)
    {
        return iValue1 + iValue2;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number");
        int no1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        int no2 = sobj.nextInt();

        int ans = Addition(no1,no2);

        System.out.println("Addition is : "+ ans);
    }
}