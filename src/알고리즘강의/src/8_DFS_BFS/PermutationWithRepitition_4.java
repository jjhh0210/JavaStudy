import java.util.Scanner;

public class PermutationWithRepitition_4 {
    static int[] pm;    //L=0~M-1번까지 뽑은 구슬 번호를 담을 배열
    static int n, m;

    public static void DFS(int L) {
        if(L==m){//시작이 L=0이니까 원래는 m-1번까지만 수행해야됨
            for(int x: pm) System.out.print(x+" "); //pm배열 출력 ex) 1 1
            System.out.println();
        }
        else{
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        DFS(0);
    }
}
