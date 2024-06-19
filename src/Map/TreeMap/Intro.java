package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Intro {
    public static void main(String[] args) {

        //使用默认构造器创建treeMap,是无序的（也没有排序）
//        TreeMap treeMap = new TreeMap();

        //按照传入的k(String)的大小进行排序
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的k(String)的大小进行排序
                //按照传入的k(String)的长度大小进行排序
                //return ((String)o1).compareTo((String)o2);
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("krisi","克雷斯");
        treeMap.put("smith","史密斯");

        System.out.println("treeMap="+treeMap);


    }
}
