
package Ritik;

import java.util.Objects;


class Emp implements Comparable{

    @Override
    public int compareTo(Object o) {
       
        Emp x=(Emp)o;
        //int k=name.length();
        //int m=name.length();
        if(this.name.length()>x.name.length())
        {
            return 1;
        }
        else if(this.name.length()<x.name.length())
            return -1;
        else
            return 0;
                    
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Emp{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    
    private int age;
    private String name;
    private double sal;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
    
}
