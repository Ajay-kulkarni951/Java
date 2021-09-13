package Program5.java;

// 5. Accept one number from user and print that number of * on screen.

import java.util.Scanner;

class Print
{
    public void Display(int iNo)
    {
        for(int i = 0; i < iNo; i++)
        {
            System.out.println("*");
        }
    }
}

public class Program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number");
        int no = sobj.nextInt();

        Print pobj = new Print();
        pobj.Display(no);
    }
}
