/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListImpt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class TpyeUnsafeArrayList {
    public static void main(String[] args) {
        
    
    ArrayList al=new ArrayList();
    al.add("Raushan");
    al.add("Ram");
    al.add("Aman");
    al.add(10);
    al.add(10.5);
    al.add('K');
    al.add("Raushan");
    al.add(4,"shan");
//    for(int i=0;i<al.size();i++)
//    {
//        System.out.println(al.get(i));
//    }
//   for(Object i:al)
//            System.out.println(i);
   // al.removeAll(al);
   Iterator it=al.iterator();
   while(it.hasNext())
   {
       Object obj=(Object)it.next();
        System.out.println(obj);
   }
    }   
}
