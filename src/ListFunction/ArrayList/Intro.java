package ListFunction.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList注意事项
 * ArrayListDetail.java
 * 允许填入所有类型的元素，包括空元素，ArrayList可以加入null,并且多个
 * ArrayList是由数组来实现存储的
 * ArrayList基本等同于Vector，除了ArrayList是线程不安全(执行效率高)，在多线程情况下，不建议使用ArrayList，可以考虑用Vector
 */
public class Intro {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);
    }
}
