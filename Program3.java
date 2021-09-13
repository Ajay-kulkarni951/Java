package Program3.java;

// 3. Program to print 5 to 1 numbers on screen.

import java.util.Scanner;

class Print
{
    public void Display()
    {
        for(int i = 5; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}

public class Program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        Print pobj = new Print();
        pobj.Display();
    }
}
