/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class Hmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap();
        hm.put(1,"Raushan");
        hm.put(2,"Shan");
        hm.put(3,"Raushan");
        hm.put(7,"Aryan");
        hm.put(4,"Suman");
        hm.put(5,"Karan");
        hm.put(6,"Ram");
        Set<Integer> e=hm.keySet();
        Iterator<Integer>It=e.iterator();
        while(It.hasNext())
        {
            int i=It.next();
            System.out.println(i);
        }
        System.out.println("");
        Collection<String> c=hm.values();
        Iterator<String>Ite=c.iterator();
        while(Ite.hasNext())
        {
            String i=Ite.next();
            System.out.println(i);
        }
        System.out.println("");
        Set<Entry<Integer,String>> l=hm.entrySet();
        Iterator<Entry<Integer,String>> it=l.iterator();
        while(it.hasNext())
        {
            Entry i=it.next();
            System.out.println(i);
            
        }
        System.out.println("");
        String i=hm.get(5);
        System.out.println(i);
        System.out.println(hm.containsValue("Raushan"));
       
    }
    
}
