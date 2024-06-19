package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Intro {
    public static void main(String[] args) {


//        TreeSet treeSet = new TreeSet();
        //添加数据
        //1.当我们是用无参构造器，创建TreeSet时，仍然是无序的
        //2.希望添加的元素按照字符串大小来排序
        //3.使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类），并指定排序规则
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面调用String的 compareTo 方法进行字符串大小比较

                //return ((String)o2).compareTo((String)o1);
                return ((String)o2).length()-((String)o1).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("chang");
        treeSet.add("a");
        treeSet.add("abc");//无法添加，因为长度也为3,由于比较器，认为长度相等是相同的元素

        System.out.println("treeSet="+treeSet);
    }
}
