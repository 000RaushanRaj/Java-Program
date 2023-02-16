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
public class TrueFalse {
   public static void main(String[] args)
	{
                int m=0,k=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int j = scanner.nextInt();

		int[] values = new int[j];

		System.out.println("Enter the elements of the array : ");
		for (int i = 0; i < j; i++)
		{
			values[i] = scanner.nextInt();
		}
		for (int i = 0; i < j; i++)
		{
			if (checkPrime(values[i]))
			{
				m++;
			}
                        else
                        {
                            k++;
                        }
		}
                if(m==j||k%2==0)
                    System.out.println("B Win the match");
                else
                    System.out.println("A win the match");

	}

	public static boolean checkPrime(int n)
	{
		//if (n <= 1)
			//return false;

		int i = 2;
		while (i <= n / 2)
		{
			if ((n % i) == 0)
				return false;
			i++;
		}

		return true;
	}
}
