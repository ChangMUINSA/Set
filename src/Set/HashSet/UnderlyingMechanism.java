package Set.HashSet;

public class UnderlyingMechanism {
    /**
     * HashSet底层机制说明
     * 分析HashSet的添加元素底层是如何实现（hash()+equals（））
     *
     * HashSet的底层是HashMap
     * 添加一个元素时，先得到hash值，会转成->索引值
     * 找到存储数据表table,看这个位置是否已经存放有元素
     * 如果没有则直接加入
     * 如果有，调用equals比较，如果相同，就放弃添加，如果不同，则添加到最后
     * 在Java8中，如果一条链表的元素个数到达TREEIFY—_THRESHOLD（默认是8)并且table的大小>=MIN_TREEIFY_CAPACITY(默认值64)就会进行树化（红黑树）
     */
}
