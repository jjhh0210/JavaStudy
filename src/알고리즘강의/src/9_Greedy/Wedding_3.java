import java.util.*;

class Time2 implements Comparable<Time2> {
    public int time;
    public char state;
    Time2(int time, char state){
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 ob){
        if(ob.time==this.time) return this.state-ob.state;  //알파벳순 오름차순 정렬
        else return this.time - ob.time;
    }
}

public class Wedding_3 {
    public static int solution(ArrayList<Time2> arr) {
        Collections.sort(arr);
        int cnt = 0;    //현재 인원
        int answer = 0; //최대 인원
        for(Time2 ob : arr){
            if(ob.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer,cnt);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT=kb.nextInt();
            int eT=kb.nextInt();
            arr.add(new Time2(sT, 's'));
            arr.add(new Time2(eT, 'e'));
        }
        System.out.println(solution(arr));
    }
}
