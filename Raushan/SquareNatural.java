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
public class SquareNatural {
      public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of N");
        n=kb.nextInt();
        for(int i=1;i<=n;i++)
        {
            int k=0;
            k=k+i*i;
            System.out.println(k);
    }
    
}
    
}
