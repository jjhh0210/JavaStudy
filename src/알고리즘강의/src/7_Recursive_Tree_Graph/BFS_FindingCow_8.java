import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_FindingCow_8 {

    public static int BFS(int s, int e) {
        int answer = 0;
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];    //체크배열, 1~10000까지 인덱스 사용하기 위해
        Queue<Integer> q = new LinkedList<>();
        int L = 0;  //레벨

        q.offer(s); //먼저 루트원소를 넣는다
        ch[s]=1; //루트도 체크해줘야됨!!
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                //1.L레벨의 원소 하나 빼기
                int cur = q.poll();
                //if(cur==e) return L; //얘보다는 자식 탐색할 때 바로 찾는게 나음
                //2. 그 원소의 자식들 탐색 및 큐에 삽입
                for (int j = 0; j < dis.length; j++) {
                    int child = cur + dis[j];
                    if(child ==e) return L+1;   //자식중에 찾은경우 리턴(자식이니까 그 다음레벨일 것임)
                    if (child >= 1 && child <= 10000 && ch[child] == 0) {
                        //방문되지 않은 자식들 큐에 offer
                        q.offer(child);
                        ch[child]=1;
                    }
                }
                System.out.println(q);
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(BFS(s, e));
    }
}
