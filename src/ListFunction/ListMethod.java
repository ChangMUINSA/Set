package ListFunction;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //在index位置插入元素
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1,"贾宝玉");
        System.out.println("list="+list);
        System.out.println("===========================================");
        //在index位置将所有元素加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list="+list);
        //get 获取指定index位置的元素
        System.out.println(list.get(1));
        System.out.println("=======================================");
        //返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("贾宝玉"));
        System.out.println("=======================================");
        //返回obj在集合中最后出现的位置
        System.out.println(list.lastIndexOf("贾宝玉"));
        //移除指定index位置的元素，并返回此元素
        System.out.println("=======================================");
        System.out.println(list.remove(3));
        //设置index位置的元素，相当于替换
        System.out.println("=======================================");
        list.set(3,"玛丽");
        System.out.println("list="+list);
        //返回从fromIndex到toIndex位置的子集合(子集合包头不包尾）
        System.out.println("=======================================");
        System.out.println(list.subList(0, 2));
    }
}
