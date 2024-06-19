package ListFunction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class exercise2 {
    public static void main(String[] args) {

        //List list = new ArrayList();
        List list = new LinkedList();
        //List list = new Vector();

        list.add(new Book("三国演义","罗贯中",10.1));
        list.add(new Book("水浒传","古龙",5.1));
        list.add(new Book("红楼梦","曹雪芹",12.1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println("===========================================================================");
        //冒泡排序
        sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    //如何对集合进行排序
    //静态方法
    //价格要求是从小到大
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0 ; i < listSize-1; i++){
            for (int j = 0; j < listSize-1-i; j++){
                //取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j,book2);
                    list.set(j+1,book1);

                }
            }
        }
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
                "name=" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
