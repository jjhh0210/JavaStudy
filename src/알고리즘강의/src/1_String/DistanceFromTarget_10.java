import java.util.Arrays;
import java.util.Scanner;

public class DistanceFromTarget_10 {
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();
        int d = 1000;   //문자 t와의 거리,무한대(1000)로 초기화
        //1. 왼->오
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] == t) d=0;
            else d++;
            answer[i] = d;
        }
//        System.out.println(Arrays.toString(answer));
//        System.out.println("d = "+d);
        //2. 오->왼
        d=1000; //초기화해줘야
        for (int i = s.length() - 1; i >= 0; i--) {
            if(chars[i]==t) d=0;
            else{
                d++;
                if(answer[i]>d) answer[i] = d; //둘 중 작은값 넣기 : answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
