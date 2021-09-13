package Program1.java;

//1.Program to divide two numbers

import java.util.Scanner;

class Divide
{
    public int Divide(int iNo1,int iNo2)
    {
        if(iNo2 == 0)
        {
            return -1;
        }

        return (iNo1 / iNo2);
    }
}


public class Program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int no1 = sobj.nextInt();
        int no2 = sobj.nextInt();

        Divide dobj = new Divide();

        int iRet = dobj.Divide(no1,no2);

        System.out.println("Division of two numbers is : "+ iRet);
    }
}
