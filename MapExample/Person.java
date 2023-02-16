
package MapExample;


public class Person {

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    private int age;
    private String name;
    
    
}
