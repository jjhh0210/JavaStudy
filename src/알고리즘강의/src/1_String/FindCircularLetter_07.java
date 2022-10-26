import java.util.Scanner;

public class FindCircularLetter_07 {
    public static String solution(String str) {
        /*My Sol*/
//        if(new StringBuilder(str).reverse().toString().equalsIgnoreCase(str))
//            return "YES";
//        return "NO";

        /*Other Sol*/
        //대칭 위치의 문자 직접 비교 (i<len/2동안 도는것 주의) -> 더 빠르다
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }
}
