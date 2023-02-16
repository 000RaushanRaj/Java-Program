/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ritik;

import java.util.ArrayList;
import java.util.Iterator;


public class arrayList {
    public static void main(String[] args) {
      ArrayList<String> month=new ArrayList();
       month.add("January");
       month.add("February");
       month.add("March");
       month.add("April");
       month.add("May");
       month.add("June");
       month.add("July");
       month.add("August");
       month.add("September");
       month.add("October");
       month.add("November");
       month.add("December");
       Iterator<String> it=month.iterator();
       while(it.hasNext())
       {
           String str =it.next();
           System.out.println(str);
       }
       
    }
    
    
}
