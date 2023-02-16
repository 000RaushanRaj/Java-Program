/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Long>hm=new HashMap<>();
        hm.put("Raushan",8409093952L);
        hm.put("Raj",8409095952L);
        hm.put("Aryan",8409095962L);
        hm.put("Kumar",8408593952L);
        hm.put("Suman",8402193952L);
        Set s=hm.entrySet();
        Iterator <Map.Entry<String,Long>> it=s.iterator();
        while(it.hasNext())
        {
            Entry e =it.next();
            System.out.println("Name= "+e.getKey()+ " , MobNo= "+e.getValue());
        }
         
    }
    
}
