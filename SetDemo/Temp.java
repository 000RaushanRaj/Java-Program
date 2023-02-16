/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetDemo;

/**
 *
 * @author DELL
 */
public class Temp implements Comparable {

    @Override
    public String toString() {
        return  "Name=" + Name + ", Age=" + Age + ", Sal=" + Sal ;
    }
    
   

    public Temp(String Name, int Age, double Sal) {
        this.Name = Name;
        this.Age = Age;
        this.Sal = Sal;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setSal(double sal) {
        this.Sal = sal;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getSal() {
        return Sal;
    }
    private String Name;
    private int Age;
    private double Sal;
    
//    public int compareTo(Object o)
//    {
//        Temp t=(Temp)o;
//        if(this.Age>t.Age)
//            return 1;
//        else if(this.Age<t.Age)
//            return -1;
//        else
//            return 0;
//    }
      public int compareTo(Object o)
    {
        Temp t=(Temp)o;
        return this.Name.compareTo(t.Name);
    }
}
