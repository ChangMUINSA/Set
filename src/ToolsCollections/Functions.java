package ToolsCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Functions {

    public static void main(String[] args) {
        //创建ArrayList用于测试
        ArrayList arrayList = new ArrayList();
        arrayList.add("tom");
        arrayList.add("smith");
        arrayList.add("king");
        arrayList.add("milan");
        //反转List中元素的顺序
        Collections.reverse(arrayList);
        System.out.println("arrayList="+arrayList);
        System.out.println("==========================================================");
        // 对List集合元素进行随机排序
        Collections.shuffle(arrayList);
        System.out.println("arrayList="+arrayList);
        System.out.println("==========================================================");
        //根据元素自然顺序对指定List集合元素按升序排序
        Collections.sort(arrayList);
        System.out.println("arrayList="+arrayList);
        System.out.println("==========================================================");
        //根据指定的Comparator产生的顺序堆List集合元素进行排序
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("arrayList="+arrayList);
        System.out.println("==========================================================");
        //将List集合中的i处元素和j处元素进行交换
        Collections.swap(arrayList,0,1);
        System.out.println("arrayList="+arrayList);
        System.out.println("==========================================================");

        //根据元素的自然排序，给定集合中的最大元素
        System.out.println("==========================================================");
        System.out.println("自然顺序组大元素="+Collections.max(arrayList));
        //根据Comparator指定的顺序，给定集合中的最大元素
        //比如我们返回长度最大的元素
        System.out.println("==========================================================");
        Object o=Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("长度最大的元素="+o);
        //min同理

        //返回指定集合中指定元素出现的次数
        System.out.println("==========================================================");
        System.out.println(Collections.frequency(arrayList, "tom"));
        //将后面集合的内容复制到前面的集合中去
        System.out.println("==========================================================");
        ArrayList dest = new ArrayList();
        //为了完成一个完整的拷贝，我们需要先给dest赋值，大小和arrayList.size()一样
        for (int i = 0; i < arrayList.size(); i++) {
            dest.add(null);

        }
        Collections.copy(dest,arrayList);
        System.out.println("dest="+dest);
        //使用新值替换List中所有的旧值
        //如果List中有tom就替换成汤姆
        Collections.replaceAll(arrayList,"tom","汤姆");
        System.out.println("==========================================================");
        System.out.println("arrayList="+arrayList);


    }
}
