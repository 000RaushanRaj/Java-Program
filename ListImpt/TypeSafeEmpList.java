/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListImpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TypeSafeEmpList {
    public static void main(String[] args) {
        ArrayList<AEmp>AList=new ArrayList<>();
        AEmp e1=new AEmp("Raushan",50000,26);
        AEmp e2=new AEmp("shan",52000,25);
        AEmp e3=new AEmp("Ram",55000,28);
        AEmp e4=new AEmp("Ankit",60000,27);
        AEmp e5=new AEmp("Aman",57000,20);
        AEmp e6=new AEmp("Aryan",650000,24);
        AEmp e7=new AEmp("Suman",590000,23);
        AEmp e8=new AEmp("Sandeep",80000,21);
        AList.add(e1);
        AList.add(e2);
        AList.add(e3); 
        AList.add(e4); 
        AList.add(e5);
        AList.add(e6);
        AList.add(e7); 
        AList.add(e8);
       Iterator<AEmp> it=AList.iterator();
       while(it.hasNext())
       {
           AEmp e =it.next();
           System.out.println(e);
       }
//       Scanner kb=new Scanner(System.in);
//        System.out.println("Enter the details of Emplloyed");
//        String str=kb.next();
//        double sal=kb.nextDouble();
//        int age=kb.nextInt();
//        AEmp f=new AEmp(str,sal,age);
        //System.out.println("Remove Emp="+AList.remove(f));
        //System.out.println("After removing Emp!");
        //Iterator<Emp> it=AList.iterator();
        System.out.println("After Sorting");
        Collections.sort(AList);
        for(AEmp e:AList)
        System.out.println(e);
        
       
        
    }
    
    
    
}
