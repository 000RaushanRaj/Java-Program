/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapDemo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MissArrayElement {
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        int arr[]=new int[5];
        int brr[]=new int[4];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            
            int k=kb.nextInt();
            arr[i]=k;
        }
        System.out.println("Enter the  new arry elements");
        for(int i=0;i<brr.length;i++)
        {
           int k=kb.nextInt();
           brr[i]=k;
        }
        int p=0;
        for(int i=0;i<arr.length;i++){
            p=arr[i];
            for(int j=0;j<brr.length;j++)
            {
                if(arr[i]==brr[i])
                {
                    continue;
                }
            
            }
               
        } 
        System.out.println("Missing Array Element:="+p);
        
        
       
    }
    
}
