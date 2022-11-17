public class PartialSet_6 {
    static int n;
    static int[] ch;    //체크배열(인덱스=원소,부분집합의 배열로 사용한다 안한다 체크)

    public static void DFS(int L) {
        if(L==n+1){
            //종착지점 (즉, n=4될 때 종착, 부분집합 만들어짐)
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp += (i + " ");   //ch배열에 1로 체크되어있는 원소들 출력
            }
            if(tmp.length()>0) System.out.println(tmp); //공집합 아니면 출력
        }
        else{
            ch[L] = 1;  //(사용한다)
            DFS(L + 1);     //왼쪽
            ch[L] = 0;  //(사용하지 않음)
            DFS(L + 1);//오른쪽
        }

    }

    public static void main(String[] args) {
        n=3;
        ch = new int[n + 1];    //인덱스번호를 원소로 사용한다고 생각
        DFS(1);
    }
}
