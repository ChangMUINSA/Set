package ListFunction.Vector;

/**
 *Vector类的定义说明
 * public class Vector<E>
 *      extends AbstractList<E>
 *      implements List<E>
 * Vector 底层也是一个对象数组 protected Object[] elementData;
 * Vector是线程同步的，即线程安全的，Vector类的操作方法有synchronized
 * 在开发中，需要线程同步安全时，考虑使用Vector
 * 如果是无参，默认10,满后就按照两倍扩容
 * 如果指定大小，则每次直接按照两倍扩
 */
public class Intro {
}
