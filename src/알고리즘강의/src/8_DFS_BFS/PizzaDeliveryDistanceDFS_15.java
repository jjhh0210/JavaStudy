import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaDeliveryDistanceDFS_15 {
    static int n, m, len, answer=Integer.MAX_VALUE; //len = 피자집개수
    static int[] combi;
    static ArrayList<Point> hs, pz; //hs = 집들의 위치, pz = 피자집의 위치
    public static void DFS(int L, int s){
        if (L == m) {   //조합 완성됐을 떄
            //1. 각 집마다 피자집조합과의 최소거리, 그 합을 구함
            //System.out.println("combi: "+ Arrays.toString(combi));
            int sum = 0;
            for (int i = 0; i < hs.size(); i++) {
                int dis = Integer.MAX_VALUE;
                for (int j = 0; j < m; j++) {
                    dis = Math.min(dis, Math.abs(hs.get(i).x - pz.get(combi[j]).x) + Math.abs(hs.get(i).y - pz.get(combi[j]).y));    //최소거리
                    //System.out.print("피자집이("+pz.get(combi[j]).x+", "+pz.get(combi[j]).y+")일 때 dis="+dis+", ");
                }
                //System.out.println(dis);
                sum +=dis;
            }
            //System.out.println("sum= "+sum);
            //2. 합의 최소값 갱신
            answer = Math.min(answer, sum);

        } else {   //조합 뽑기
            for (int i = s; i < len; i++) {
                combi[L] = i;   //L번째에 i를 뽑음
                DFS(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pz=new ArrayList<>();
        hs=new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp=kb.nextInt();
                if(tmp==1) hs.add(new Point(i, j));
                else if(tmp==2) pz.add(new Point(i, j));
            }
        }
        len=pz.size();
        combi=new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }
}
