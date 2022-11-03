import java.util.Scanner;

public class SeenStudent_2 {
    public static int solution(int n, int[] arr){
        int answer = 0; //cnt seen student
        int max = 0;
        for (int x : arr) {
            if(max<x){
                answer++;
                max = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, arr));
    }
}
