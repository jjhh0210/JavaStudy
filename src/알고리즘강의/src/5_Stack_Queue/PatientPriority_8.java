import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int danger=0;
    int num=0;
    Person(int num,int danger){
        this.num = num;
        this.danger = danger;
    }

}

public class PatientPriority_8 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0; //m번째 환자가 몇번째로 진료받는지
        int cnt=0;
        Queue<Person> q = new LinkedList<>();
        //1.queue초기화
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }
        //2.
        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                if (x.danger > tmp.danger) {
                    q.offer(tmp);
                    tmp = null; //뒤로 돌아간 환자면 null로 구분(위험도 가장 커서, 바로 진료 받을 환자랑 구분해야함)
                    break;
                }
            }
            if (tmp != null) {
                //바로 진료받는 환자라면
                cnt++;  //몇번째 진료 환자인지 체크
                if (tmp.num==m){
                    answer = cnt;      //만약 그게 m번째 환자라면 루프 finish
                    return answer;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
