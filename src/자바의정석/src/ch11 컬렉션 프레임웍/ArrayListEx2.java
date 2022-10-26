import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        //문자열을 LIMIT크기로 잘라서 List에 담아서 출력
        final int LIMIT = 10;
        String src = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        List list = new ArrayList(src.length() / LIMIT + 10);   //크기를 넉넉히 잡는다

        for (int i = 0; i < src.length(); i += LIMIT) {
            //10씩 증가
            if (i + LIMIT < src.length()) {
                list.add(src.substring(i, i + LIMIT));
            }else {
                list.add(src.substring(i)); //i부터 끝까지
            }
        }
//        for (Object o : list) {   //원소의 타입은 Object이다. String x!!
//            System.out.println(o);  //자동으로 o.toString()이 되는듯
//        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
