package Program4.java;

// 4. Accept one number and check whether is is divisible by 5 or not.

import java.util.Scanner;

class Check
{
    public boolean check(int iNo)
    {
        if(iNo % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number");
        int no = sobj.nextInt();

        Check cobj = new Check();
        boolean bRet = cobj.check(no);

        if(bRet)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }
    }
}
