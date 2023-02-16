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
public class King {
    public void king(int n)
    {
        int x[]=new int[100];
        x[0]=0;
        x[1]=1;
        x[2]=1;
        int y[]=new int[100];
        y[0]=0;
        y[1]=1;
        y[2]=2;
        //System.out.println(n);
        for(int i=3;i<=n;i++)
        {
            x[i]=y[i-1];
            System.out.println(x[i]);
            y[i]=x[i-1]+y[i-1];
            System.out.println(y[i]);
        }
        int result=x[n]+y[n];
        int z=(result*result);
        System.out.println(z);
    }
    
}
