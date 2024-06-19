package Map.Properties;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //增加  key-value 不能为null
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",88);
        properties.put("lic",100);//如果有相同的key,value被替换
        System.out.println("pro="+properties);

        //通过key获取对应的值
        System.out.println(properties.get("lic"));
        //删除
        properties.remove("lic");
        System.out.println("pro="+properties);
        //修改，直接put替换
    }
}
