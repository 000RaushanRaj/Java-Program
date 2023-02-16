
package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Factorecu {
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();   
        if(num>=0) 
        {
           
           int factorial=findFactorial(num);
           System.out.println("The factorial of the entered the number is :"+factorial);
        }        
        else
        {
           
            System.out.println("Please enter valid input.");
        } 
    }
    
    public static int findFactorial(int num)
    {
        if (num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*findFactorial(num-1);        
    }

    
}
