import java.util.*;
class Lecture implements Comparable<Lecture>{
    public int money;
    public int time;
    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture ob){
        return ob.time-this.time;   //시간 내림차순 정렬 (돈은 내림차순 정렬할 필요가 없다)
    }
}
public class MaxMoneySchedule_4 {
    static int n, max=Integer.MIN_VALUE;
    public static int solution(ArrayList<Lecture> arr){
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//큰 값을 우선으로
        Collections.sort(arr);
        int j=0;    //j = 리스트 원소 번호
        for(int i=max; i>=1; i--){  //i = 며칠째인지(i=max일째 부터 i=1일째 까지)
            for(; j<n; j++){    //j는 매번 0부터가 아니라 저번에 멈춘 곳 부터 다시 시작!!!
                if(arr.get(j).time<i) break;    //time==i인 애들만 pq에 삽입
                pq.offer(arr.get(j).money);
            }
            if(!pq.isEmpty()) answer+=pq.poll();    //i일 째에 할 수 있는 최대 수입의 강연을 뽑는다
        }
        return answer;

    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m=kb.nextInt();
            int d=kb.nextInt();
            arr.add(new Lecture(m, d));
            if(d>max) max=d;
        }
        System.out.println(solution(arr));
    }
}
