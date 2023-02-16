/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.Scanner;


public class PrintPrime {
    public static void main(String[] args) {
        int n,j,i,count;
        
         Scanner kb=new Scanner(System.in);
         System.out.println("Enter the Range of n");
         n=kb.nextInt();
        
          for( i=1;i<=n;i++)
          {
              count=0;
          
              for( j=1;j<=i;j++)
        {
         if(i%j==0 )
         
             
           
               count++;
        } 
          if(count==2)
          
             System.out. println(i);
           
          }  
    }
  }
