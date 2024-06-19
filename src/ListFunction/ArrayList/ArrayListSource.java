package ListFunction.ArrayList;

import java.util.ArrayList;

/**
 * ArrayList中维护了一个Object类型的数组elementData
 * transient Object[] elementData
 * transient 表示瞬间的，短暂的，表示该属性不会被序列化
 * 当创建ArrayList对象时，如果是用的是无参构造器，则初始elementDta容量为0,第一次添加，则扩容elementDta为10；如果再次扩容，则扩容elementDta为1.5倍.
 * 如果是用的是指定大小的构造器，则初始elementDta容量为指定大小，如果需要扩容，则直接扩容elementDta为1.5倍.
 */
public class ArrayListSource {
    public static void main(String[] args) {
        //使用无参构造器创建ArrayList对象
        ArrayList arrayList = new ArrayList();

        //使用for给list集合添加1-10数据
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        ////使用for给list集合添加11-15数据
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);


    }
}
