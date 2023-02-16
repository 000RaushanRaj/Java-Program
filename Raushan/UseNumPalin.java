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
public class UseNumPalin {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number");
        int p=kb.nextInt();
        NumPalin p1=new NumPalin();
        boolean r=p1.isPalin(p);
        System.out.println(r);
    }
    
}
