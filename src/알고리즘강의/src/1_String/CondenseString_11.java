import java.util.Scanner;

public class CondenseString_11 {
    public static String solution(String s) {
        String answer = Character.toString(s.charAt(0)); //String.valueOf(s.charAt(0));
        int num = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] != chars[i - 1]) {
                //전에문자랑 다르면
                if (num == 1)
                    answer += String.valueOf(chars[i]);
                else
                    answer += (num + String.valueOf(chars[i]));
                num=1;
            }else{
                //전에문자랑 같으면
                num++;
            }
        }
        //마지막 처리
        if(num>1)
            answer+=num;
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

}
