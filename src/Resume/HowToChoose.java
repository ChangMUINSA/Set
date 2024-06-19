package Resume;

public class HowToChoose {
    /**
     * 在开发中，选择什么集合实现类，主要取决于业务操作特点，然后根据集合实现类特性进行选择，分析如下
     * 先判断存储的类型：一组对象[单列]或一组键值对[双列]
     * 一组对象：Collection接口
     * 允许重复：List
     *          增删多：LinkedList[底层维护了一个双向链表]
     *          改查多：ArrayList[底层维护了Object类型可变数组]
     * 不允许重复：Set
     *          无序：HashSet[底层是HashMap，维护了一个哈希表即（数组加链表加红黑树）]
     *          排序：TreeSet
     *          插入和取出顺序一致：LinkedHashSet,维护数组+双向链表
     * 一组键值对： Map
     *          键无序：HashMap[底层是哈希表]
     *          键排序:TreeMap
     *          键插入和取出顺序一致：LinkedHashMap
     *          读取文件 Properties
     */
}
