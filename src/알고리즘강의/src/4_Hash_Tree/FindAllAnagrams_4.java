import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllAnagrams_4 {
    public static int solution(String a, String b){
        int answer = 0; //아나그램이 되는 부분문자열 수
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        //1. b맵 초기화
        for(char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        //printMap(bm);
        //2. a맵 초기화
        int len = b.length()-1;//b문자열 길이
        for (int i = 0; i < len; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }
        //printMap(am);
        int lt = 0;
        for (int rt = len; rt < a.length(); rt++) { //rt증가
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1); //rt위치의 char을 put하며 빈도수체크
            //printMap(am);
            if(am.equals(bm)) answer++; //만약 am == bm이면 카운트
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);   //lt자리의 빈도수 하나 빼기
            if(am.get(a.charAt(lt))==0)
                am.remove(a.charAt(lt));    //만약 뻈는데 0이면 삭제
            lt++;//lt증가
            //printMap(am);
        }
        return answer;
    }
    public static void printMap(Map<Character, Integer> map) {
        for (Map.Entry<Character,Integer> e : map.entrySet()) {
            System.out.println(e);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(solution(a, b));
    }
}
