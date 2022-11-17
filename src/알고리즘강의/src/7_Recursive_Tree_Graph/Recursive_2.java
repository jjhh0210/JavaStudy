public class Recursive_2 {
    public static void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n / 2);
            System.out.print(n%2);  //호출 밑에다 두면 거꾸로 출력!
        }
    }
    public static void main(String[] args) {
        DFS(2);
    }
}
