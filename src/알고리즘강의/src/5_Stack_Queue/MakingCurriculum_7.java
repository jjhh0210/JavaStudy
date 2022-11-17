import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakingCurriculum_7 {
    public static String solution(String need, String plan){
        Queue<Character> q = new LinkedList<>();
        //1. queue 초기화
        for (int i = 0; i < need.length(); i++) {
            q.offer(need.charAt(i));
        }
        //2. queue와 plan비교
        for (int i = 0; i < plan.length(); i++) {
            System.out.println(q);
            if(q.isEmpty()) return "YES";
            if(q.peek() == plan.charAt(i)) {
                q.poll();
            }
        }
        return "NO";
    }
    public static String solution2(String need, String plan){
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        //1. 큐에 필수과목 초기화
        for(char x : need.toCharArray()) q.offer(x);
        //2. 교육과정과 필수과목의 순서 비교
        for (char x : plan.toCharArray()) {
            if(q.contains(x)){//x는 필수과목인가?
                if(x!=q.poll()) return "NO";    //필수과목의 순서와 다르면 바로 No 리턴
            }
        }
        if(!q.isEmpty()) return "NO"; //필수과목을 덜들은 경우도 no 리턴
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(solution(a, b));
    }
}

