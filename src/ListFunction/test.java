package ListFunction;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //List结合类中元素有序（即添加顺序和取出顺序一致），且可重复
        List list =new ArrayList();
        list.add("jack");
        list.add("Tom");
        list.add("marry");
        list.add("hsp");
        list.add("Tom");

        System.out.println("list="+list);
        System.out.println("=================================================");
        //list集合中的每个元素都有其对应的顺序索引，即支持索引
        //索引从0开始
        System.out.println(list.get(3));
    }
}
