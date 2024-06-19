package Intro.Collection.goThrough;

import java.util.ArrayList;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
        List objects = new ArrayList<>();

        objects.add(new Dog("pierre",2));
        objects.add(new Dog("tom",5));
        objects.add(new Dog("charlot",3));

        java.util.Iterator iterator = objects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===================================================");
        for(Object object:objects){
            System.out.println(object);
        }
        System.out.println("===================================================");
        System.out.println(objects);
    }
}
class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}