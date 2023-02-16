/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListImpt;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class AEmp implements Comparable {

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AEmp other = (AEmp) obj;
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "name="+name + ", sal=" + sal + ", age=" + age ;
    }

    public AEmp(String name, double sal, int age) {
        this.name = name;
        this.sal = sal;
        this.age = age;
    }
    private String name;
    private double sal;
    private int age;

    public int compareTo(Object o){
     AEmp x=(AEmp)o;
     if(this.name.length()>x.name.length())
         return 1;
     else if(this.name.length()<x.name.length())
         return -1;
     else
         return 0;
            
    }
    
}
