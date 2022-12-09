import java.util.ArrayList;
import java.util.Scanner;

public class Ex2606_Virus {
    static int n, m, answer =0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void DFS(int v) {
        for (int nv : graph.get(v)) {
            if (ch[nv] == 0) {
                ch[nv] = 1;
                DFS(nv);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //컴퓨터 수(정점 수)
        m = sc.nextInt();   //입력할 인접 쌍 개수
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());    //각 정점의 인접행렬 생성
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);    //반대경우도 넣어줘야~
        }
        ch[1] = 1;
        DFS(1);
        for (int i = 2; i < ch.length; i++) {
            if(ch[i]==1) answer++;
        }
        System.out.println(answer);

    }
}
