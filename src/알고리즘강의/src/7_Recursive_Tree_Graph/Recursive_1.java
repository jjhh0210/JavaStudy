public class Recursive_1 {
    public static void DFS(int n) {
        if(n==0) return;    //함수 종료
        else{
            //System.out.print(n+" "); //결과: 3 2 1
            DFS(n - 1);
            System.out.print(n+" ");  //결과: 1 2 3
        }
    }
    public static void main(String[] args) {
        DFS(3);
    }
}
