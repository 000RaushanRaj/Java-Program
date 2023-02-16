/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.Scanner;


public class Primenextn0 {
    public static void main(String[] args) {
        int i,j,count;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value Of i:");
        i=kb.nextInt();
        while(i<=++i)
        {
        count=0;
        {
        for(j=1;j<=i;j++)
        if (i%j==0)
        count++;
        
        
        }    
        if(count==2)
            System.out.println(i);
        //i++;
       // break;
       
        break;
        
       }
    }
    
}
