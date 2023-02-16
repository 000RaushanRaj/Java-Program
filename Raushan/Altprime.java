/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;
class GFG{

public static void main(String[] args)
{
    int n = 15;
    System.out.println("Following are the alternate " +
                         "prime number smaller than " +
                                   "or equal to " + n);
 
    // Function calling
   // print_alternate_prime(n);
}
static int prime(int num)
{
int i, flag = 0;
for(i = 2; i<= num / 2; i++)
{
    if(num % i == 0)
    {
        flag = 1;
        break;
    }
}
 
// if flag = 0 then number is prime
// and return 1 otherwise return 0
if(flag == 0)
    return 1;
else
    return 0;
}
 /*
// Function for printing
// alternate prime number
static void print_alternate_prime(int n)
{
// counter is initialize with 0
int counter = 0;
 
// looping through 2 to n-1
for(int num = 2; num < n; num++)
{
    // function calling along
    // with if condition
    if (prime(num) == 1)
    {
        // if counter is multiple of 2
        // then only print prime number
        if (counter % 2 == 0)
            System.out.print(num + " ");
                 
        counter ++;
    }
}*/
}
 