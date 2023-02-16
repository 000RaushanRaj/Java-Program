/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class UseTemp {
     public static void main(String[] args) {
        Temp e1=new Temp("Raushan",26,21000);
        Temp e2=new Temp("Shan",27,22000);
        Temp e3=new Temp("Ram",28,23000);
        Temp e4=new Temp("Aushan",23,24000);
        Temp e5=new Temp("Ankit",22,25000);
        Temp e6=new Temp("Aryan",21,26000);
        Temp e7=new Temp("Suman",20,27000);
        Temp e8=new Temp("Kishan",29,28000);
        Temp e9=new Temp("Aman",25,29000); 
        Temp e10=new Temp("Sandeep",24,20000);
        Temp e11=new Temp("Kishan",29,28000);
        TreeSet<Temp>hs=new TreeSet<>();
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);
        hs.add(e6);
        hs.add(e7);
        hs.add(e8);
        hs.add(e9);
        hs.add(e10);
        hs.add(e11);
        Iterator<Temp>it=hs.iterator();
        while(it.hasNext())
        {
            Temp e=it.next();
            System.out.println(e);
        }
        
                
    }
    
}
