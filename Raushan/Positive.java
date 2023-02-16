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
public class Positive {
    public static void main(String[] args) {
       int a;
       
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
       a=sc.nextInt();
        if(a>0)
            System.out.println("No is +ve");
            else if(a==0)
                System.out.println("No is Zero");
        else
                System.out.println("No is -ve");
    }
    
}
