
package Raushan;

import java.util.Scanner;
public class reverseNo {
    public static void main(String[] args) {
        int n,k=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n:");
         n=kb.nextInt();
         while(n>0)
         {
             k=n%10;
            n=n/10;
         
         System.out.print(k);
         }
    }  
}
