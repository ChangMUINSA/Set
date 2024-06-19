package Set.HashSet;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class HashSetSource {
    public static void main(String[] args) {
        //1.构造器走源码
        Set hashSet = new HashSet();
        /**
         *  public HashSet() {
         *         map = new HashMap<>();
         *     }
         */
        //2.可以存在null值，但只能有一个null,即元素不能重复
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet ="+hashSet);
        System.out.println("====================================================================");
        //3.HashSet不保证元素是有序的，取决于hash值后，再确定索引的结果（即不保证元素存放顺序和取出顺序一致）
        //4.在执行add方法后会返回一个Boolean,如果添加成功返回true，如果添加失败，返回false
        HashSet hashSet1 = new HashSet();
        System.out.println(hashSet1.add("john"));
        System.out.println(hashSet1.add("lucy"));
        System.out.println(hashSet1.add("john"));
        System.out.println(hashSet1.add("jack"));
        System.out.println(hashSet1.add("Rose"));
        //5.可以通过remove指定删除某个对象
        System.out.println("====================================================================");
        hashSet1.remove("john");
        System.out.println("hashSet1:"+hashSet1);

        //6.HashSet 不能添加相同的元素/数据？
        HashSet set = new HashSet();
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        set.add(new Dog("Tom"));//ok
        set.add(new Dog("Tom"));//ok
        System.out.println("set="+set);

        //7.再加深一下，非常经典的面试题
        //需要看源码，底层机制
        System.out.println("====================================================================");
        set.add(new String("chang"));//ok
        set.add(new String("chang"));//加入不了
        System.out.println("set="+set);



    }
}
class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
