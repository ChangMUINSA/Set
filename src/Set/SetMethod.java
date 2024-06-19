package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //以Set接口的实现类 HashSet 来讲解Set接口的方法
        //Set接口的实现类的对象（Set接口对象），不能存放重复的元素，可以添加一个null
        //Set接口对象存放数据是无序（即添加顺序和取出顺序不一致）
        //注意：取出的顺序是固定的虽然不是添加的顺序，但是他是固定的
        //
        Set set = new HashSet();
        set.add("john");
        set.add("luck");
        set.add("jack");
        set.add("john");//重复
        set.add(null);
        set.add(null);//再次添加null

        System.out.println("set="+set);
        //注意：取出的顺序是固定的虽然不是添加的顺序，但是他是固定的
        System.out.println("========================================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("set= "+ set);
        }
        System.out.println("========================================================");

        //遍历
        //1.使用迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println("obj="+object);
        }
        System.out.println("========================================================");
        set.remove(null);
        //2.增强for循环
        for (Object object :set) {

            System.out.println("obj="+object);
        }


    }
}
