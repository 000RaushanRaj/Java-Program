
package Raushan;

import java.util.Scanner;


public class primeterm {
    
    public static void main(String []args)           
    {
     int i=0,j,n,count=1;
     Scanner kb =new Scanner(System.in);
     System.out.println("Print the nth prime number!:-");
     
     System.out.println("Enter the nth term to print!:-");
     n=kb.nextInt();
     while( i<n)
     {
         count=count+1;
         for(j=2;j<=count;j++)
         {
            if( count%j==0)
            {
                
               break;
            }
            
         }    
           if(j==count) 
           {
               i=i+1;
           }
            
     }  
     System.out.println(n+ "th Prime no is:-");
         System.out.println(count);
         
     
    }    
    }      
  
     
     
        
       
        
        
        
        
        
        
        
        
        
        
        
         
    
    

