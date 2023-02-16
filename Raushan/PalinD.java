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
public class PalinD {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        str=kb.next();
        String ptr="";
        for(int i=0;i<str.length();i++)
        {
            ptr=str.charAt(i)+ptr;
        }
        if(str.equals(ptr))
           
       System.out.println("palindrome");
        else
        System.out.println("not palindrome");
        
    }
    
}
