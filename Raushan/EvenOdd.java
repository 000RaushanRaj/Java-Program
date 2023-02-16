/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=kb.nextInt();
        if(a%2==0)
            System.out.println("Even:");
        else
            System.out.println("Odd:");
    }
        
    
}
