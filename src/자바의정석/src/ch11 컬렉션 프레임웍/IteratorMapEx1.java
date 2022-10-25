import java.util.*;

public class IteratorMapEx1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        //1. 모든 entry 읽기
        System.out.println("====모든 entry쌍 읽기====");
        Iterator it = map.entrySet().iterator();    //Set
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //2. 모든 key 읽기
        System.out.println("====모든 key 읽기====");
        it = map.keySet().iterator();   //Set
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //3.모든 values 읽기
        System.out.println("====모든 values 읽기====");
        it = map.values().iterator();   //Collection
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
