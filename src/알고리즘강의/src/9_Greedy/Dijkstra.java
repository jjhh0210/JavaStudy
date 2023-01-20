import java.util.*;
class Edge implements Comparable<Edge>{
    public int vex;
    public int cost;
    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge ob){
        return this.cost-ob.cost;   //오름차순(작은 것을 poll)
    }
}

class Dijkstra {
    static int n, m;    //n = 정점의 개수 , m = 간선의 개수
    static ArrayList<ArrayList<Edge>> graph;    
    static int[] dis;   //시작정점부터 모든 정점까지의 최단 거리(비용)
    public static void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));   //시작 지점 우선 offer
        dis[v]=0;
        while(!pQ.isEmpty()){
            Edge tmp=pQ.poll(); //poll 할 때 가장 작은 것을 poll(작은것이 우선이 되도록 설정했기 때문)
            int now=tmp.vex;    //현재 정점
            int nowCost=tmp.cost;   //현재 정점까지의 비용
            if(nowCost>dis[now]) continue;  //노트 참고, dis에의 현재 정점까지의 최소비용보다 더 큰 비용으로 뻗어나갈 이유가 없으므로 거름
            for(Edge ob : graph.get(now)){  //현재 정점과 인접한 정점들을 탐색한다.
                if(dis[ob.vex]>nowCost+ob.cost){
                    dis[ob.vex]=nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        dis=new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);    //1번정점에서 출발
        for(int i=2; i<=n; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible"); //처음에 초기화 했던 값과 같으면 impossible이라고 출력
        }
    }
}