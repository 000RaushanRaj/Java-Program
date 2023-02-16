
package Raushan;

import java.util.Scanner;


public class Facto {
    public static void main(String[] args) {
        int n,k=1;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n:");
         n=kb.nextInt();
         while(n>=1)
         {
             k=k*n;
            n--;
         }
         System.out.println(k);
         
    }
    
    
}
