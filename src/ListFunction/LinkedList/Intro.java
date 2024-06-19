package ListFunction.LinkedList;

/**
 * LinkedList底层实现了双向链表和双端队列特点
 * 可以添加任意元素（元素可以重复），包括null
 * 线程不安全，没有实现同步
 *
 * LinkedList的底层操作机制
 * LinkedList的底层维护了一个双向链表
 * LinkedList维护了两个属性first和last分别指向首节点和尾接点
 * 每个节点（Node）对象，里面又维护了prev,next,item三个属性，其中通过prev指向前一个，通过next指向后一个节点，最终实现双向链表
 * 所以LinkedList的元素的添加和删除，不是通过数组完成的，相对来说效率高
 *
 *每次遍历都要重新指定头尾
 */
public class Intro {
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node chang = new Node("chang");

        //链接三个节点，形成双向链表
        //jack -> tom -> chang
        jack.next = tom;
        tom.next = chang;
        //jack <- tom <- chang
        chang.pre = tom;
        tom.pre = jack;

        Node first = jack;//让first指向jack，就是双向列表的头结点
        Node last = chang;//让last指向chang，就是双向列表的尾结点

        //演示，从头到尾进行遍历

        while (true){
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
        System.out.println("===========================================================");
        //演示，从尾到头的遍历
        while (true){
            if (last == null) {
                break;
            }
            //输出first信息
            System.out.println(last);
            last = last.pre;
        }
        //演示链表添加对象/数据，是多么的方便
        //要求在tom------chang之间插入一个对象 smith

        //先创建一个Node节点
        Node smith = new Node("smith");
        tom.next= smith;
        smith.next=chang;
        smith.pre=tom;
        chang.pre=smith;
        System.out.println("=======================================================");
        //让first再次指向jack
        first = jack;
        while (true){
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

    }
}
//定义一个Node类，Node对象它表示一个双向链表的节点
class Node{
    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name="+item;
    }
}

