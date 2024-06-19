package Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        //Map接口实现类的特点，使用实现类HashMap来举例
        //1.用于保存具有映射关系的数据：Key-Value(双列元素）(取出顺序和存入顺序不一致）
        Map map = new HashMap();
        map.put("no1","chang");//k-v
        map.put("no2","张无忌");//k-v
        System.out.println("map="+map);
        System.out.println("========================================================");
        //2.Map 中的 Key 和 Value可以是任何引用类型的数据，会封装到HashMap$Node对象中
        //3.Map 中的Key不允许重复，原因和HashSet一样
        map.put("no1","张三丰");//当有相同的Key时，就等价于替换
        //4.Map中的Value可以重复
        map.put("no5","张三丰");//k-v
        System.out.println("map="+map);

        //5.Map中的Key可以为null,Value也可以为null,注意Key为null只能有一个，Value为null可以为多个
        System.out.println("========================================================");
        map.put(null,"小明");
        map.put(null,"abc");
        map.put("no9",null);
        map.put("no10",null);

        System.out.println("map="+map);
        System.out.println("========================================================");
        //6.常用String作为Map的Key
        map.put(1,"赵敏");
        map.put(new Object(),"金毛狮王");
        System.out.println("map="+map);

        System.out.println("========================================================");
        //7.Key和Value之间存在单项一对一关系，即通过指定的Key总那个找到指定的Value
        System.out.println(map.get(1));
        //8.Map存放数据，一对key-value是放在一个Node中的，有因为HashMap$Node实现了Entry借口，所以也可以说一对key-value就是一个Entry



    }
}
