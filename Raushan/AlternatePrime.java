
package Raushan;

import java.util.Arrays;
import java.util.Scanner;


public class AlternatePrime {
        
    public static void main(String[] args) {
        int n,j,i,count;
        
         Scanner kb=new Scanner(System.in);
         System.out.println("Enter the value of i");
         i=kb.nextInt();
         System.out.println("Enter the value of n");
         n=kb.nextInt();
         
        
          while( i<=n)
          {
              
          count=0;
              for( j=1;j<=i;j+=1)
        {
         if(i%j==0 )
               count++;
        } 
          if(count==2)
          {
          
          int temp=i;
        System.out.println("print alternate prime no");
        
        
            
          }
          i++;
                    
          }  
    }
                    
    } 
    
  
    

 

