import java.util.*;

public class ClassPresidentByHashMap_1 {
    public static char solution(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>(); // <char,빈도수>
        //1. 처음보는 char을 map에 집어넣기, 다시 나오는 ch는 빈도수 증가
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch,1);
            }else{
                int num = map.get(ch);
                map.replace(ch, ++num);
            }
        }
        //2. max값 찾기
        Iterator it = map.entrySet().iterator();   //set.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character,Integer> e = (Map.Entry) it.next();
            //System.out.println(e);
            int number = e.getValue();
            if (number > max) {
                max = number;
                answer = e.getKey();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n, str));
    }
}
