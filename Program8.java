package Program195.java;
import java.util.Scanner;

public class Program195
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int no1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        int no2 = sobj.nextInt();

        int ans = no1 + no2;

        System.out.println("Addition is : "+ ans);
    }
}