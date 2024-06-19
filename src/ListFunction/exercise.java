package ListFunction;

import java.util.ArrayList;
import java.util.List;
public class exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 9; i++) {
            list.add(i, new Integer(i));
        }
        list.add(1,"教育");
        System.out.println("=======================================================");
        System.out.println(list.indexOf(4));
        System.out.println(list.remove(5));
        System.out.println("=======================================================");
        java.util.Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
