package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapMethodSum {

    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put添加
        map.put("邓超",new Book("安徒生",10));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("马哲","马蓉");
        map.put("刘玲波",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        System.out.println("map="+map);
        System.out.println("====================================");
        //2.remove:根据键删除映射关系
        map.remove(null);
        System.out.println("map="+map);
        System.out.println("====================================");
        //3.根据键获取值
        Object val = map.get("鹿晗");
        System.out.println(val);
        System.out.println("====================================");
        //4.size：获取元素个数
        System.out.println(map.size());
        System.out.println("====================================");
        //5.isEmpty：判断个数是否为0
        System.out.println(map.isEmpty());
        System.out.println("====================================");
        //6.clear:清除
        //7.containsKey：查找键是否存在
        System.out.println(map.containsKey("鹿晗"));


    }
}
class Book{
   private String name;
   private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
