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
public class NumPalin {
     public boolean isPalin(int k)
     {
         int j=k;
         int m=0;
         boolean res=false;
         while(j>0)
         {
             m=(m*10)+j%10;
             j=j/10;
         }
         if(k==m)
            res=true;
         return res;
     }
    
}
