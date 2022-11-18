import java.util.*;
class BFSGraphShortestDis_14 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;   //거리 배열을 이용해보자!
    public void BFS(int v){
        //1.큐,레벨,체크배열 루트로 초기화
        ch[v] = 1;
        dis[v] = 0; //루트의 거리는 0
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        int L=0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cv = Q.poll();  //current vertex
                for (int nv : graph.get(cv)) { //next vertex
                    if(ch[nv]==0) { //방문안했으면 방문
                        Q.offer(nv);
                        ch[nv] = 1;
                        dis[nv] = dis[cv] + 1;  //현재 정점 의 자식이므로 거리는 +1
                    }
                }
            }
            L++;    //사실상 이 문제에선 쓸모 없음
        }

    }

    public static void main(String[] args){
        BFSGraphShortestDis_14 T = new BFSGraphShortestDis_14();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}