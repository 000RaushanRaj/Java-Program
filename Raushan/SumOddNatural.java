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
public class SumOddNatural {
    public static void main(String[] args) {
        int n,m=1,k=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n:");
         n=kb.nextInt();
         while(m<=n)
         {
             k=k+m;
             
            m=m+2;
         }
         System.out.println(k);
         
    }
    
    
}
