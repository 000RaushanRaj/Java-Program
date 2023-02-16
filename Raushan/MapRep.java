/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.HashMap;
import java.util.Scanner;



public class MapRep {
   
    public static void main(String[] args) {
     
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of n");
         int n=kb.nextInt();
         int arr[]= new int[n];
         System.out.println("Enter Array Element");
        for(int i=0;i<n;i++){
        arr[i]=kb.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int ch=arr[i];
            if(hm.containsKey(ch))  
            {
               int of=hm.get(ch);
               int nf=of+1;
               hm.put(ch, nf);
            }
            else
                hm.put(ch, 1);
        }
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        int i=arr[0];
        for(Integer it:hm.keySet())
        {
            if(hm.get(it)>hm.get(i))
                i=it;
        }
        System.out.println("Max frequency := "+i);
    }
    
}
    
