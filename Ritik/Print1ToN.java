/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ritik;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Print1ToN {
    public static void ptintNo(int i,int n) {
        if(i<=n)
        {
            System.out.print(i);
            ptintNo(i+1,n);
        }
        else
            return;
        
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=kb.nextInt();
        ptintNo(0,n);
    }
    
}
