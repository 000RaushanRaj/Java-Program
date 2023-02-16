/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;


public class Car {
    private int speed;
    public Car()
    {
        System.out.println("Speed is"+speed);
                
    }
    public Car(int x)
    {
        speed =x;
        System.out.println("Speed is"+speed);
        
    } 
    {
        speed =100;
        System.out.println("initilizer block is executed");
    }
}
