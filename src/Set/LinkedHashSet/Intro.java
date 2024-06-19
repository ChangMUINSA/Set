package Set.LinkedHashSet;

public class Intro {
    /**
     * LinkedHashSet是HashSet的子类
     * LinkedHashSet底层是LinkedHashMap,底层维护了一个数组加双向链表
     * LinkedHashSet根据元素的HashCode的值来决定元素的存储位置
     * 同时使用链表维护元素的次序
     * 这使得元素看起来是以插入顺序保存的
     * LinkedHashSet不允许添加重复元素
     *
     * 在LinkedHashSet底层维护了一个hash表和双向链表
     * LinkedHashSet有head 和 tail
     * 每一个节点都有pre和next属性，这样可以形成双向链表
     * 在添加一个元素时，先求hash值，再求索引，确定该元素在HashTable的位置，然后将该元素加入到双向链表（如果已经存在，不添加，原则和HashSet一样）
     *
     * tail.next = newElement;//简单指定
     * newElement.pre = tail;
     * tail = newElement;
     *
     * 这样的话，我们遍历LinkedHashSet也能确保插入顺序和遍历顺序一致
     *
     *
     */
}
