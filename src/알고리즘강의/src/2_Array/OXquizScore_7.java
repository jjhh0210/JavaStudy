import java.util.Scanner;

public class OXquizScore_7 {
    public static int solution(int n, int[] arr) {
        int sum=0,cnt=0; //sum: 전체 점수 합산, cnt: 한 문제에 대한 점수

        for (int i = 0; i < arr.length; i++) {
            //정답을 맞춘 경우
            if (arr[i] == 1) {
                cnt++;
                sum+=cnt;
            }
            else cnt=0;
        }
        return sum;
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
