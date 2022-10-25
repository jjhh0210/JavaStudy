import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
    /*1~45 정수 6개 골라 출력*/
    public static void main(String[] args) {
        Set set = new TreeSet();
//        Set set = new HashSet();

        while (set.size() < 6) {
            set.add((int) (Math.random() * 45) + 1);
        }
        //TreeSet은 저장할 때 이미 정렬하므로 따로 정렬 필요 x
        //HashSet은 정렬 필요(LinkedList list-> Collections.sort(list))
        System.out.println(set);    
    }
}
