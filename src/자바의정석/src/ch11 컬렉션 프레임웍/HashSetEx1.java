import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {

        
        Object[] objArr = {"1", new Integer(1), 1, "2", "2", 'a', "a"};
        Set s = new HashSet();
        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i] + " = " + s.add(objArr[i]));
        }
        System.out.println(s);  //add순서 != 저장된 순서
    }
}
