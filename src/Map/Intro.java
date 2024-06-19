package Map;

public class Intro {
    /**
     * Map接口实现类的特点
     * K-V(Map 的 K唯一，V(默认常量）不变就是set)
     * HashTable(<-Properties) HashMap TreeMap
     *
     *
     * Map 与 Collection并列存在，用于保存具有映射关系的数据：Key-Value
     * Map 中的 Key 和 Value可以是任何引用类型的数据，会封装到HashMap$Node对象中
     * Map 中的Key不允许重复，原因和HashSet一样
     * Map中的Value可以重复
     * Map中的Key可以为null,Value也可以为null,注意Key为null只能有一个，Value为null可以为多个
     * 常用String作为Map的Key
     * Key和Value之间存在单项一对一关系，即通过指定的Key总那个找到指定的Value
     * Map存放数据，一对key-value是放在一个Node中的，有因为Node实现了Entry借口，所以也可以说一对key-value就是一个Entry
     */
}
