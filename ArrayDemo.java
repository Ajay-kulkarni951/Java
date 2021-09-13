package ArrayDemo.java;
import java.lang.*;
import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String args[])
    {
        // ways in which we can create one dimensional array

        //1
        int arr[];           // just reference
        arr = new int[5];    //memory allocation on heap

        //2
        int brr[] = new int[5];

        //3
        int crr[] = {10,20,30,40,50};

        //array has length property which will gives the number of elements of array
        System.out.println("Size of crr is : "+crr.length);

        for(int iCnt = 0; iCnt < crr.length ; iCnt++)
        {
            System.out.println(crr[iCnt]);
        }
    }
}
