package Set.HashSet;

public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet 的底层结构（HashMap 的底层结构）
        //1.创建一个数组，数组的类型是Node
        //2.有些人直接把Node数组称为表
        Node[] table = new Node[16];
        System.out.println("table="+table);

        //3.创建节点
        Node john = new Node("john",null);
        Node jack = new Node("jack", null);
        Node Rose = new Node("Rose", null);
        Node Lucy = new Node("Lucy", null);


        table[2]= john;
        john.next=jack;//将jack节点挂载到john
        jack.next=Rose;//将Rose节点挂载到jack
        table[3] = Lucy;//把Lucy放到table表的索引为3的位置
        System.out.println("table="+table);

    }
}
class Node{//节点，存储数据，可以指向下一个节点，从而形成链表
    Object item;//存放数据
    Node next;//可以指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}