package Program2.java;

// 2. Program to print 5 times “Marvellous” on screen.

import java.util.Scanner;

class Print
{
    public void Display(int iNo)
    {
        for(int i = 0; i < iNo; i++)
        {
            System.out.println("Marvellous");
        }
    }
}

public class Program2
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
