import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();  //
//        Set set = new HashSet();

        //1. 1~50 사이 수 25개 난수 추가
        while (set.size() < 25) {
            //size가 0일때부터 추가하므로 size 24일때 원소 25개 됨
            set.add((int) (Math.random() * 50) + 1);
        }
        //2. 출력
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i == 4) {
                System.out.println(it.next());
                i = 0;
                continue;
            }
            System.out.printf("%2d ",it.next());
            i++;
        }

    }
}
