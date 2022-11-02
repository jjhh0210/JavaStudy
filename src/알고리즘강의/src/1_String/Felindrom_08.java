import java.util.Scanner;

public class Felindrom_08 {
    public static String solution(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");  //a-z,A-Z가 아닌 문자는 다 ""로 치환
//        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equalsIgnoreCase(s)) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
