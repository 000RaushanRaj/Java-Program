
package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AlterPrime {
        public static void main(String args[])
    {
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the range of number : ");
         System.out.println("Enter the minimum number : ");
         int i=kb.nextInt();
        System.out.println("Enter  the maximum number : ");
        int num = kb.nextInt();

        System.out.println("The alternate prime numbers within " +i + " to " +num+" are :");
        int iter = 2;
        for( i = 2; i<=num;i++)
        {
            if(isPrime(i))
            {
                if(iter%2==0)
                    System.out.print(i+", ");
                iter++;
            }
        }

    }
    
    static boolean isPrime(int num)
    {
        int iter = 2;
        boolean flag = true;
        while (num > iter)
        {
            if (num % iter == 0)
            {
                flag = false;
                break;
            }
            iter++;
        }
        return flag;
    }

}
    

