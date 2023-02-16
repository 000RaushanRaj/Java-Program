/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

/**
 *
 * @author DELL
 */
public class Palindrome {
    
   public boolean isPalindrome(String str)
   {
       String ptr="";
       boolean res=false;
       for(int i=0;i<str.length();i++)
       {
           ptr=str.charAt(i)+ptr;
           
       }
       if(str.equals(ptr))
       {
           res=true;
       }
       return res;
   }
}
