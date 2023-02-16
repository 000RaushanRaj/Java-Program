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
public class UsePalindrome {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=kb.next();
        Palindrome p=new Palindrome();
       boolean m= p.isPalindrome(s1);
        System.out.println(m);
    }
    
}
