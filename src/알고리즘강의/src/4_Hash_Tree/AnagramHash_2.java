import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramHash_2 {
    public static String solution(String s1, String s2) {
        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<>(); //for s1
        HashMap<Character, Integer> map2 = new HashMap<>(); //for s2
        //1. map1, map2에 문자별 빈도수 넣기
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        //2.map1을 돌면서,map2와 같은지 비교
        for (char key : map1.keySet()) {
            //map2에 key가 없거나, map2의 key에 대한 value가 다르면 애너그램이 아니다!
            if(!map2.containsKey(key)||map1.get(key) != map2.get(key)){
                answer = "NO";
                break;  // 그냥 return "NO"할수도 있다
            }
        }
        return answer;
    }
    public static String solution2(String s1, String s2){
        String answer="YES";
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
//        for (Map.Entry<Character,Integer> e : map.entrySet()) {
//            System.out.println(e);
//        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(solution2(a, b));
    }
}
