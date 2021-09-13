package ArrayDemo2.java;
// Accept N numbers from user and display its addition

import java.lang.*;
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String args[])
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter the number of elements");
        size = sobj.nextInt();  //Accept the size of array from user

        int arr[] = new int[size];  // Allocate memory for array

        System.out.println("Enter the elements of array");
        for(iCnt = 0; iCnt <  arr.length; iCnt++)
        {
            arr[iCnt] = sobj.nextInt(); // Accept the values of array
        }

        int iSum = 0;
        //Calculate addition
        for(iCnt =0 ; iCnt <arr.length;iCnt++)
        {
            iSum = iSum + arr[iCnt];  //Perform the addition
        }
        System.out.println("Addition of all elements is : "+iSum);
    }
}
