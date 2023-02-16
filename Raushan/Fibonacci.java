

package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Fibonacci {
    
        public static void main(String[] args) {
        int n,i=1,a=-1,b=1,c=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n term:");
         n=kb.nextInt();
         while(i<=n)
         {
            c=a+b;
          
         System.out.println(c);
         a=b;
         b=c;
         i++;
         
             
        
         }
        
    }
}

         
             
        
         
        
    

