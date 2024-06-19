package Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;

public class Exercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("奥迪",10000));//ok
        set.add(new Car("保时捷",20000));//ok
        set.add(new Car("法拉利",30000));//ok
        set.add(new Car("奥迪",20000));
        set.add(new Car("奥迪",10000));

        System.out.println("set="+set);

    }
}
class Car{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price) {

        this.name = name;
        this.price = price;
    }
    //重写equals方法 和 hashCode
    //当name 和 price相同时，就返回相同的hashCode值，equals返回true

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}