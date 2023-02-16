/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class HashMapKey {
        public static void main(String[] args) {
        HashMap<String,Long>hm=new HashMap<>();
        hm.put("Raushan",8409093952L);
        hm.put("Raj",8409095952L);
        hm.put("Aryan",8409095962L);
        hm.put("Kumar",8408593952L);
        hm.put("Suman",8402193952L);
        Set s=hm.keySet();
        Iterator <String> it=s.iterator();
        while(it.hasNext())
        {
            String e =it.next();
            System.out.println("Name= "+e);
        }
         
    }

    
}
