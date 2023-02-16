/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Fibonacciterm {
    public static void main(String[] args) {
        int n,i=1,a=-1,b=1,c=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n term:");
         n=kb.nextInt();
         while(i<=n)
         {
            c=a+b;
          
         //System.out.println(c);
         a=b;
         b=c;
         i++;
         
             
        
         }
        System.out.println(c);
    }
}

    

