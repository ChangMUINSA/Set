package Intro.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //add:添加单个元素 因为是object，所以可以放任意类型(不再是基本数据类型，是对象）
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println("list="+list);

        //remove：删除指定元素
        //System.out.println(list.remove(0));//删除第一个元素
        System.out.println("list="+list);
        System.out.println(list.remove(true));//指定删除某个元素
        //System.out.println(list.remove(new Integer(10)));

        //contains:查找元素是否存在
        System.out.println(list.contains("jack"));

        //size获取元素个数
        System.out.println(list.size());

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());

        //clear:清空
        list.clear();
        //System.out.println("list="+list);

        //addAll:添加多个元素
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("红楼梦");
        objects.add("三国演义");
        list.addAll(objects);
        System.out.println("list="+list);

        //containsAll:查找多个元素是否存在
        System.out.println(list.containsAll(objects));

        //removeAll:删除多个元素
        list.add("聊斋");
        list.removeAll(objects);
        System.out.println("list="+list);

    }
}
