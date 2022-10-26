import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args) {
        Collection c = new HashSet();
//        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        
        //1. ArrayList 기본 읽어오기 -> Collection 종류 바꾸면 바뀌어야
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //2. iterator 객체 이용해서 읽어오기 -> Collection 종류 바뀌어도 변경 x
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    
        //iterator는 1회용이므로 다 쓰고나면 다시 iterator 객체 얻어와야 한다.
        it = c.iterator();   //새로운 객체 생성
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

    }
}
