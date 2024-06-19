package Intro.Collection.goThrough;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口遍历对象方式2-for循环增强
 * 增强for循环，可以代替iterator迭代器，特点：增强for就是简化版的iterator，本质一样
 * 只能用于遍历集合或者数组
 * for(元素类型 元素名：集合名或数组名）{
 *     访问元素
 * }
 */
public class ForEnhance {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("水浒传","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",12.1));
        //使用增强for,在Collection集合使用
        //增强for底层也是迭代器
        //增强for可以理解为简化版本迭代器
        //快捷方式I
        for(Object book : col){
            System.out.println("book:"+book);
        }
        //增强for也可以直接在数组使用
        int[] nums = {1,8,10};
        for(int i : nums){
            System.out.println(i);
        }
    }
}
