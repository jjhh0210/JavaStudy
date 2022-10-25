import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);    //크기가 10인 arraylist 생성
        //추가
        list1.add(3);
        list1.add(new Integer(3));
        list1.add(new Integer(1));
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.add(new Integer(5));

        ArrayList list2 = new ArrayList(list1.subList(0, 3));   //331
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        
        //정렬
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list1.contains(list2) = " + list1.containsAll(list2));

        list2.add('a');
        System.out.println("list2 = " + list2);
        list2.add(1,"ABC"); //1 자리에 추가
        System.out.println("list2 = " + list2);
        list2.set(1, "abc");    //1 자리에 변경
        System.out.println("list2 = " + list2);
        
        //변경 및 삭제
        list1.retainAll(list2); //list1에서 list2와 겹치는 부분 빼고 다 삭제
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        for (int i = list2.size()-1; i >= 0; i--) {
            //list2에서 list1과 겹치는 부분만 삭제
            //제어변수 감소시키며 삭제해줘야 요소 이동 영향 없이 제대로 삭제 가능
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        System.out.println("list2 = " + list2);


    }
}
