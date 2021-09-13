package Program197.java;
import java.util.Scanner;

class Mathematics
{
    int Addition(int x, int y)
    {
        return x + y;
    }
}

public class Program197
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int no1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        int no2 = sobj.nextInt();

        Mathematics mobj = new Mathematics();
        int ans = mobj.Addition(no1 , no2);

        System.out.println("Addition is : "+ ans);
    }
}