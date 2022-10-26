import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "dog", "Lion", "Bear"};
        System.out.println(Arrays.toString(strArr));
        //1.기본정렬 - 사전순
        Arrays.sort(strArr);    //Bear Lion cat dog
        System.out.println("1.기본정렬:"+Arrays.toString(strArr));
        //2. 대소문자 구분 x 정렬
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("2.대소문자 구분x 정렬:"+Arrays.toString(strArr));
        //3. 역순 정렬
        Arrays.sort(strArr, new Descending());  //Comparator 구현한 객체
        System.out.println("3.역순정렬:"+Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2)*-1;
        }
        return -1;
    }
}