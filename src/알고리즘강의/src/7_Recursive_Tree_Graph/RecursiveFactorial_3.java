public class RecursiveFactorial_3 {
    public static int DFS(int n) {
        int fact = 1;
        if(n==1) return 1;
        else{
            return n * DFS(n - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println(DFS(5));

    }
}
