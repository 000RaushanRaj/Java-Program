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
public class NumberToWords {
    public void chk(int n, String ch)
    {
        String one[]={""," one"," two"," three"," four"," five",
                    " six"," seven"," eight"," nine"," ten",
                    " eleven"," twelve"," thirteen"," fourteen",
                    " fifteen"," sixteen"," seventeen"," eighteen",
                    " nineteen"};
        
        String ten[]={"",""," twenty"," thirty"," forty"," fifty",
                    " sixty"," seventy"," eighty"," ninety"};
        
        if(n>19)
        {
            System.out.println(ten[n/10]+" "+one[n%10]);
        }
        else
        {
            System.out.println(one[n]);
        }
        if(n>0)
        {
            System.out.println(ch);
        }
    }
    public static void main(String arg[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Enter numbers greater then 0");
        }
        else
        {
            NumberToWords a=new NumberToWords();
            a.chk((n/1000000000)," billion");
            a.chk((n/10000000)%100," crore");
            a.chk((n/10000)%100," lakh");
            a.chk((n/1000)%100," thousand");
            a.chk((n/100)%10," hundred");
            a.chk((n%100),"");
        }
    }
}

    

