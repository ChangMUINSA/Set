package Map.HashTable;

import java.util.Hashtable;

public class Intro {
    /**
     * 存放的元素是键值对：K-V
     * hashTable的键和值都不能为null，否则会抛出NullPointerException
     * hashTable的使用方法和基本上和HashMap一样
     * hashTable是线程安全的(synchronized)，HashMap是线程不安全的
     */
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100);
        //table.put(null,100);
        //table.put("john ",null);
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",88);
        System.out.println("table="+table);

        //简单说明一下HashTable的底层
        //1.底层有数组HashTable$Entry[],初始化大小为11
        //2.临界值 threshold 8=11*0.75
        //3.扩容：按照自己的扩容机制扩容即可
    }

}
