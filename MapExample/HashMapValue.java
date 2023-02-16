
package MapExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapValue {
    public static void main(String[] args) {
        HashMap<String,Long>hm=new HashMap<>();
        hm.put("Raushan",8409093952L);
        hm.put("Raj",8409095952L);
        hm.put("Aryan",8409095962L);
        hm.put("Kumar",8408593952L);
        hm.put("Suman",8402193952L);
        Collection c=hm.values();
        Iterator <Long> it=c.iterator();
        while(it.hasNext())
        {
            Long e =it.next();
            System.out.println(" MobNo= "+e);
        }
         
    }
    
}
