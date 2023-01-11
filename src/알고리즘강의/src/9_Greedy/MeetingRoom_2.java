import java.util.*;

class Time implements Comparable<Time> {
    public int s,e;
    Time(int s,int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s-o.s;    //끝나는 시간이 같으면 시작시간으로 오름차순정렬
        else return this.e-o.e; //기본적으로 끝나는 시간으로 오름차순 정렬(this보다 비교대상이 커서 음수가 됨-> 오름차순)
    }
}

public class MeetingRoom_2 {
    public static int solution(ArrayList<Time> arr, int n){
        int cnt = 0;
        Collections.sort(arr);
        int et = 0; //현재 회의 끝나는시간, end time
        for(Time ob : arr){
            if(ob.s>=et){   //비교할 회의시작시간이 현재 회의 끝나는시간보다 크면 선택!
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(solution(arr, n));
    }
}

