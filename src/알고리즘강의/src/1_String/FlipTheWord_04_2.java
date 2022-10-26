import java.util.ArrayList;
import java.util.Scanner;

public class FlipTheWord_04_2 {
    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        /*StringBuilder의 reverse로 뒤집기*/
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;

        /*문자배열로 직접뒤집기 구현*/
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt=x.length()-1;    //lt = 배열 첫 원소 시작, rt = 배열 끝원소 시작
            while(lt<rt){
                //하나씩 lt는 올라오고 ,rt는 내려가면서 서로 값 교환
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : solution(n, str)) {
            System.out.println(x);
        }
        
    }
}
