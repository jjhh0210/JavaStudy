import java.util.Scanner;

public class CondenseString_11_2 {
    public static String solution(String s) {
        String answer = "";
        s = s + " ";    //i,i+1 비교를 위해 마지막에 빈문자 하나 추가
        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {    //빈문자전까지 for문돌림 -> i<s.length()-1
            //문자가 같으면
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            //문자가 다르면
            else{
                if(cnt>1) answer += s.charAt(i)+String.valueOf(cnt);  //그냥 s.charAt(i)+cnt하면 정수로 계산됨!(a+2 -> 99)
                else answer += s.charAt(i);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }
}
