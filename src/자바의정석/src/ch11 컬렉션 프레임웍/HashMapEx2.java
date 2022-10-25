import java.util.*;
import java.util.Map.Entry;

/*
* (이름, 성적) 데이터 다루기
* */
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("kim", 90);
        map.put("park", 100);
        map.put("lee", 80);
        map.put("kim2", 100);  //중복 안되니까 kim2로
        map.put("choi", 25);

        //1.이름: ~, 점수: ~ 출력
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
//            String name = (String) it.next();
//            int score = (int) map.get(name);
//            System.out.println("이름: "+name+", 점수: "+score);
            Entry e = (Entry) it.next();
            System.out.println("이름: "+e.getKey()+", 점수: "+e.getValue());
        }
        //2. 참가자 명단 출력
        System.out.println("참가자 명단: "+map.keySet());

        //3. 점수 통계 출력
        Collection scores = map.values();    //반환타입 Collection 객체임 주의! (list나 set으로 형변환 안됨)
        System.out.println(scores); //Collection은 중복 허용하는가 보다.
        it = scores.iterator();
        int total=0;
        while (it.hasNext()) {
            int score = (int)it.next();
            total += score;
        }
        System.out.println("총점: " + total);
        System.out.println("평균: " + (float)total / scores.size());
        System.out.println("최고점수 : " + Collections.max(scores));
        System.out.println("최고점수 : " + Collections.min(scores));
        
        //my)점수만 정렬
        List list = new ArrayList(map.values());  //Collection -> list로 변환하는 법
        Collections.sort(list);

        //my) 점수 -이름 정렬 )다시 찾아보깅!
//        List entries = new LinkedList(map.entrySet());  //Set -> List로
//        Collections.sort(entries, (Entry e1, Entry e2) -> e1.getValue().compareTo(e2.getValue()));
//        System.out.println(entries);





        
        

    }
}
