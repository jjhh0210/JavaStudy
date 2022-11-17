public class FibonacciRecursive_4 {
    static int[] fibo;  //DFS(n)을 돌면서 만나는 모든 DFS(i)에 대한 결과를 배열에 저장

    public static int DFS(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else{
            return DFS(n - 2) + DFS(n - 1);
        }
    }

    public static int dfs(int n) {
        /*memorization(기록해놓는 것) 활용해서 성능 훨씬 빠르게*/
        if(fibo[n]>0) return fibo[n];   //배열에 이미 값이 들어있으면 재귀 뻗을 필요 없이 바로 사용

        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }

    public static void main(String[] args) {
        int n = 30;
        fibo = new int[n + 1];  //1~10번 인덱스 새용할거니까
        dfs(n);
        for (int i = 1; i <=n; i++) {
            System.out.print(fibo[i]+" ");   //1 1 2 3 5 8 13 21 34 55
        }
    }
}
