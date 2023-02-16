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
public class BoundryPattern {
    int n=4,m=5;
    public void getLogic()
    {
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1||j==1||i==n||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print(" "); 
                }
            }
            System.out.println();
        }
        
    }
    
}
