import java.util.Scanner;

public class OXquizScore_7 {
    public static int solution(int n, int[] arr) {
        int answer,tmp; //answer: 전체 점수 합산 tmp : 한 문제에 대한 점수
        //첫번째 문제에 대한 점수 초기화
        if (arr[0]==1) {
            answer=1;
            tmp=1;
        }else {
            answer=0;
            tmp=0;
        }

        for (int i = 1; i < arr.length; i++) {
            //정답을 맞춘 경우
            if (arr[i] == 1) {
                //이전에(arr[i-1]) 맞춘경우 or 틀린경우
                tmp= arr[i-1]==1?tmp+1:1;
                answer+=tmp;
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
