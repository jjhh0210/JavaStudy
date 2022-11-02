import java.util.Scanner;

public class ExtractNumbers_09 {
    public static int solution(String s) {
        int answer = 0;
        /*My Solution*/
//        String numbers = "";
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c)) {
//                numbers+=c;
//            }
//        }
//        answer = Integer.parseInt(numbers);
//        return answer;
        /*Other Solution*/
        for (char c : s.toCharArray()) {
            if(c>='0'&&c<='9') answer = answer * 10 + (c - '0');
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
