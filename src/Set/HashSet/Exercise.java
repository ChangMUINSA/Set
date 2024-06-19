package Set.HashSet;
/**
 *先比较HashCode,如果HashCode不同则直接添加，如果相同，则比较equals方法，如果不同添加在链表后，如果相同则不添加
 * 对象不同则HashCode一定不同
 */

import java.util.HashSet;
import java.util.Objects;

public class Exercise {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee("jack",18));//ok
        set.add(new Employee("smith",28));//ok
        set.add(new Employee("jack1",18));//no OK
        System.out.println("set="+set);
    }
}
class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //如果name 和 age的值相同，则返回相同的hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}