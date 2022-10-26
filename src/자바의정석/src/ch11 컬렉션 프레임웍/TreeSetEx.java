import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //비교기준 지정안해주면 Test객체 저장 불가
        Set set = new TreeSet(new TestComp());

        set.add(new Test());
        set.add(new Test());
        set.add(1);     //int도 new TestComp()의 compare 비교기준을 따름
        set.add(new Test());
        set.add(5);
        set.add(new Test());


        System.out.println(set);
    }
}
class Test{
   static int i = 0;
   int num = 0;

    Test() {
        num = ++i;
    }
    @Override
    public String toString() {
        return "Test"+num;
    }
}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;  //음수 or 양수이면 같지 않다는거니까 저장가능
                    //음수) 내림차순, 양수)오름차순
        //return 0; //같다는 거니까 저장 안됨
    }
}
