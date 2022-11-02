import java.util.Scanner;

public class SecretCode_12 {
    public static String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i <n; i++) {
            String tmp = s.substring(7*i,7*(i+1));
            //1. 2진수변환
            tmp = tmp.replace('#', '1').replace('*', '0');
            //2. 10진수 변환
            int num = Integer.parseInt(tmp, 2); //문자열을 2진수로 읽어서 num에는 10진수로 반환
            //3. 문자로 변환(십진수 아스키 -> 문자)
//            System.out.println((char)num);
            answer+=(char)num;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(solution(n, str));
    }

}
