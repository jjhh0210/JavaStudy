import java.util.Scanner;

public class SameSumPartialSet_1 {
    static String answer="NO";
    static int n, total=0;
    static boolean flag=false;

    //L = 0~n-1까지 인덱스
    public static void DFS(int L, int sum, int[] arr){
       if(flag) return;
       if(sum>total/2) return;
       if(L==n){
           //5번인덱스 요소까지 돌고 L=6되면 끝냄
           if((total-sum)==sum){
               answer = "YES";
               flag = true; //한번 true해놓으면 stack에 쌓여있던 모든 함수 다 return
           }
       }
       else {
           System.out.println("L: "+L+" arr[L]: "+arr[L]+" Sum: "+sum);
           DFS(L + 1, sum + arr[L], arr);  //L번째 요소를 부분집합에 포함, 그다음 자식 호출
           System.out.println("L: "+L+" arr[L]: "+arr[L]+" Sum: "+sum);
           DFS(L + 1, sum, arr);    //L번째 요소 부분집합 포함 x
       }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            total+=arr[i];  //전체 값 여기서 계산됨
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }

}

