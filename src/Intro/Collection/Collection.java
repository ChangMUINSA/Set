package Intro.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {
    @SuppressWarnings({"all"})//抑制警告错误
    public static void main(String[] args) {
        //java.util.Collection
        // Map
        //1.集合主要是两组（单列集合，双列集合）
        //2.Collection接口有两个重要的子接口 List Set,他们的实现子类都是单列集合
        //3.Map接口的实现子类是双列集合，存放的是K-V
        //4.体系图


            //单列集合
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("jack");
        objects.add("pop");

            //双列集合
        HashMap hashMap = new HashMap();
        hashMap.put("No1","北京");
        hashMap.put("No2","上海");

        /**
         * Collection 接口实现类的特点
         * public interface Collection<E>extendsIterable<E>
         * collection实现子类可以存放多个元素，每个元素可以是Object
         * 有些Collection的实现类，可以存放重复的元素，有些不可以
         * 有些Collection的实现类，有些是有序的（List)，有些是无序的（Set)
         * Collection接口没有直接的实现子类，是通过它的子接口Set,List来实现的
         */

    }
}
