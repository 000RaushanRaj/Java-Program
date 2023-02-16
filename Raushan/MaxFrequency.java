/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MaxFrequency {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the String");
        String Str=kb.next();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<Str.length();i++)
        {
            char ch=Str.charAt(i);
            if(hm.containsKey(ch))
            {
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch, nf);
            }
            else
                hm.put(ch, 1);
        }
        char mfc='a';
        for(Character Key:hm.keySet())
        {
            
            if(hm.get(Key)>hm.get(mfc))
            {
                mfc=Key;
            }
             
        }
       
        System.out.println(mfc);
    }
    
}
