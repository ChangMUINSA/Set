package Map.HashMap;

import java.util.*;

/**
 * containsKey:查找键是否存在
 * keySet:获取所有的键
 * entrySet:获取所有关系k-v
 * values：获取所有的值
 */
public class GoThroughMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("马哲","马蓉");
        map.put("刘玲波",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组： 先取出所有的Key, 通过Key取出对应的Value
        Set keySet = map.keySet();
        //(1)增强for
        System.out.println("========第一种方式=============");
        for (Object Key :keySet) {
            System.out.println(Key+"-"+map.get(Key));
        }
        //（2）迭代器
        System.out.println("========第二种方式=============");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object Key =  iterator.next();
            System.out.println(Key+"-"+map.get(Key));

        }
        //第二组：把所有的values取出
        Collection values = map.values();
        //这里可以使用所有Collections使用的遍历方法
        //（1）增强for
        System.out.println("========取出所有的value,增强for=============");
        for (Object value : values){
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("========取出所有的value,迭代器=============");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);

        }
        //第三组：通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet();//EntrySet<Map.Entry<K,V>>
        //（1）增强for
        for (Object entry :entrySet) {
            //将entry转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;//HashMap$Node -实现-> Map.Entry (getKey();getValue())
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        // //(2)迭代器
        Iterator iterator3 = entrySet.iterator();
        System.out.println("========使用EntrySet的迭代器=============");
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());

        }


    }
}
