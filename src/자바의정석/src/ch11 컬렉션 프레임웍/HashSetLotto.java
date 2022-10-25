import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        while (set.size() < 6) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        //set은 정렬 불가
        List list = new LinkedList(set);    //1. list로 변경
        Collections.sort(list);             //2. Collections.sort(list)로 정렬
        System.out.println(list);

    }
}
