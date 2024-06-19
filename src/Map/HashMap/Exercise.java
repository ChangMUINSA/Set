package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,new Employee("jack",17500,1));
        hashMap.put(2,new Employee("tom",25000,2));
        hashMap.put(3,new Employee("luck",32000,3));

        Set keySet = hashMap.keySet();
        for (Object key :keySet) {
            //先获取value
            Employee employee = (Employee) hashMap.get(key);
            if (employee.getSal() > 18000) {
                System.out.println(key+"-"+hashMap.get(key));
            }
        }
        System.out.println("===========================================");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry m = (Map.Entry) entry;
            Employee employee = (Employee) m.getValue();
            if (employee.getSal() > 18000) {
                System.out.println(m.getKey()+"-"+m.getValue());
            }

        }


    }
}
class Employee{
    private String name;
    private double sal;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}