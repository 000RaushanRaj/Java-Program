
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
public class SumSquare {
    public static void main(String[] args) {
        int n,k=0;
        Scanner kb= new Scanner(System.in);
        
         
         System.out.println("Enter the value of n:");
         n=kb.nextInt();
         while(n>=1)
         {
             k=k+n*n;
            n--;
         }
         System.out.println(k);
         
    }
    
}
