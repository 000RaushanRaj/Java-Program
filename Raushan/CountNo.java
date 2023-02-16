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
public class CountNo {
    public static void main(String[] args) {
        int n,k=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n:");
         n=kb.nextInt();
         while(n!=0)
         {
             n=n/10;
            k++;
         }
         System.out.println(k);
         
    }
    
    
}
