package ListFunction;

import java.util.ArrayList;
import java.util.List;

public class ThreeMethodGothrough {
    public static void main(String[] args) {
        //对于 ArrayList,LinkedList,Vector都适用

        List list = new ArrayList();

        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);

        //方式一：使用 iterator
        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println(object);
        }
        System.out.println("==================================================");
        //方式二：增强型for循环
        for (Object object : list) {
            System.out.println(object);
        }

        System.out.println("==================================================");

        //方式三：使用普通for
        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            System.out.println(object);

        }

    }
}
