
package Raushan;

import java.util.Scanner;
public class CheckfibonacciTerm {
     public static void main(String[] args) {
        int n,i=1,a=-1,b=1,c=0,j;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n :");
         n=kb.nextInt();
         while(i<=n)
         {
            c=a+b;
          
         System.out.println(c);
         a=b;
         b=c;
         i++;
         
             
         }
         System.out.println("Enter the value of j:");
          j=kb.nextInt();
          
          if(c==j)
              System.out.println("The term is Fibonacci Series");
          else
              System.out.println("The term is not Fibonacci Series ");
                      
                      
    }

    
}
