
package Raushan;

import java.util.Scanner;


public class Checkprime {
    
    public static void main(String[] args) {
        int n,count=0;
        Scanner kb= new Scanner(System.in);
        
         
        System.out.println("Enter the value of n :");
         n= kb.nextInt();
         for(int i=1;i<=n;i++)
         
         if(n%i==0 )
         {
             
           
               count++;
         }
          if(count==2)
             System.out. println("The number is prime:");
              
             else
             System.out.println("Not prime:");
     
            
    }
}