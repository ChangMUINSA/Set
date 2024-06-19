package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","chang");//k-v
        map.put("no2","张无忌");//k-v


        //1.k-v最后是 HashMap$Node node = newNode(hash, key, value, null)
        //2.k-v为了方便程序员的遍历，还会创建一个EntrySet集合，该集合存放的元素的类型 Entry
        //而一个Entry对象就有k-v，EntrySet<Entry<k,v>>
    }
}
