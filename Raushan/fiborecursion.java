package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class fiborecursion {
    public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		  
		   System.out.println("Enter the number to limit Fibonacci series: ");
		   int num = input.nextInt();
		   
		   for(int i = 1; i <= num; i++){
			   
		      System.out.print(printFibonacci(i) + " ");
		   }
    }
		 
		 private static int printFibonacci(int CurrentNumber){
		  
		  if(CurrentNumber == 1 || CurrentNumber == 2){
		   return 1;
		  }
		  return printFibonacci(CurrentNumber - 1) + printFibonacci(CurrentNumber - 2);
		 }


    
}
