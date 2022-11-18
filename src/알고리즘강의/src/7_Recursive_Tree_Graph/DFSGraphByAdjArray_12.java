import java.util.Scanner;

public class DFSGraphByAdjArray_12 {
    static int n, m, answer=0;  //answer = 경로 개수
    static int[][] graph;
    static int[] ch;    //체크배열!!
    public void DFS(int v){ //v=정점
        if(v==n) answer++;  //정점이 도착지점이면 경로 개수 ++
        else{
            //정점 v에 대해 모든 노드(i)로의 경로 탐색(v->i)
            for (int i = 1; i <= n; i++) {
                //1)갈 수 있는 방향이고 && 방문된 곳이 아니라면
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;    //탐색 마친 지점이니까 back 해야되므로 방문 풀어줘야함!!!
                }
            }
        }
    }
    public static void main(String[] args){
        DFSGraphByAdjArray_12 T = new DFSGraphByAdjArray_12();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];    //1~n번 정점간의 인접행렬
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1; 
        }
        ch[1]=1;    //1번노드가 출발점이니까 체크
        T.DFS(1);   //1번 시작
        System.out.println(answer);
    }
}
