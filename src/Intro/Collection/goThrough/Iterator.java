package Intro.Collection.goThrough;

import java.util.ArrayList;
import java.util.Collection;

/**
 *Collection接口遍历元素方式1-使用Iterator（迭代器）
 * iterator对象称为迭代器，主要用于遍历Collection集合中的元素
 * 所有实现了Collection借口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象，即可以返回一个值迭代器
 * Iterator的结构，截图
 * Iterator仅用于遍历集合，本身并不存放对象
 *
 * 迭代器执行原理
 * Iterator iterator = coll.iterator(); 得到一个集合迭代器
 * hasNext():判断是否还有下一个元素
 * while(iterator.hasNext()){
 *     next的作用：
 *     1.指针向下移
 *     2.将下移以后集合位置上的元素返回
 *     System.out.println(iterator.next());
 * }
 * 提示，在调用iterator.next()方法钱必须调用iterator.hasNext()进行检测
 * 若不调用，且下一条记录无效，直接调用iterator.next()会抛出NoSuchElementException异常
 */
public class Iterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("水浒传","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",12.1));

        System.out.println("col="+col);

        //遍历col集合
        //1.先得到col对应的迭代器
        java.util.Iterator iterator = col.iterator();
        //2.使用while循环遍历即可
        while (iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是Object(编译类型是object,运行类型取决于List里存放的对象，比如目前会打印toString里的内容）
            Object object = iterator.next();
            System.out.println("object="+object);
        }
        //3.当退出while循环后，这是iterator的迭代器，指向最后的元素
        //iterator.next();//会抛出NoSuchElementException异常
        
        //4.如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("第二次遍历");

        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println(object);
            
        }


        //快捷键，快速生成while循环 while => itit
        while (iterator.hasNext()) {
            Object object =  iterator.next();


        }
        //显示所有快捷键的快捷键
    }

}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
