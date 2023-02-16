/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapDemo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RepString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter String");
        String str=kb.next();
        HashMap<Character,Integer>hm=new HashMap();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(hm.containsKey(ch))
            {
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch, nf);
            }
            else
                hm.put(ch, 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
    
}
