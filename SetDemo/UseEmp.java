/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class UseEmp {
    public static void main(String[] args) {
        Emp e1=new Emp("Raushan",26,21000);
        Emp e2=new Emp("Shan",27,22000);
        Emp e3=new Emp("Ram",28,23000);
        Emp e4=new Emp("Aushan",23,24000);
        Emp e5=new Emp("Ankit",22,25000);
        Emp e6=new Emp("Aryan",21,26000);
        Emp e7=new Emp("Suman",20,27000);
        Emp e8=new Emp("Kishan",29,28000);
        Emp e9=new Emp("Aman",25,29000); 
        Emp e10=new Emp("Sandeep",24,20000);
        Emp e11=new Emp("Kishan",29,28000);
        HashSet<Emp>hs=new HashSet<>();
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
        Iterator<Emp>it=hs.iterator();
        while(it.hasNext())
        {
            Emp e=it.next();
            System.out.println("Name= "+e.getName()+ ", Age= "+e.getAge() +", Sal= "+e.getSal());
        }
        
                
    }
    
}
