import java.util.ArrayList;
import java.util.Scanner;

public class DFSGraphByAdjList_13 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph; //Integer를 저장하는 ArrayList 객체를 저장하는 ArrayList
    static int[] ch;

    public void DFS(int v){
        if(v==n) answer++;
        else{
            for (int nv : graph.get(v)) {   //v번 정점의 arrayList, nv=next 정점
                //v번 정점과 인접한 정점만 돌기 때문에 인접행렬처럼 모든 노드 i를 돌면서 인접한지 확인할 필요 없음!
                if (ch[nv] == 0) {
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }

    }

    public static void main(String[] args){
        DFSGraphByAdjList_13 T = new DFSGraphByAdjList_13();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){    //ArrayList<Integer> 객체 생성(인덱스 1~n까지 쓸꺼니까 0~n까지 생성)
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);    //a번 정점의 list에 b추가
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
