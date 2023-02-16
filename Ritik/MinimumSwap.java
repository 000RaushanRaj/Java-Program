
package Ritik;

import java.util.Scanner;


public class MinimumSwap {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=kb.nextInt(); 
        int arr[]=new int[n];
        System.out.println("Enter the element of Array");
        for(int i=0;i<n;i++)
        {
            int j=kb.nextInt();
            arr[i]=j;
        } 
         int count=0;
         for(int i=0;i<n;i++)
         {
          for(int m=i+1;m<n;m++)
          {     
            if(arr[i]==arr[m])
            {
                continue;
            }
            else if(arr[i]<arr[m])
            {
                int k=arr[m];
                arr[m]=arr[i];
                arr[i]=k;
                count++;
            } 
          }
        }
        System.out.println("count=" +count);
        System.out.println("Array element");
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    
}
