import java.util.Scanner;

public class SequencePartialSum_4 {
    public static int solution(int n, int m, int[] arr){
        int i = 0;    //index of 원소
        int k = 1;    //window
        int sum = arr[0];
        int cnt = 0;    //합이 m이 되는 연속부분수열 갯수
        System.out.println("i = " + i+", k = "+k+", sum = "+sum);
        while (i < n) {
            if (sum < m){
                if(i+1==n) break;
                sum += arr[++i];
                k++;
            } else if (sum > m) {
                sum -= arr[i - k+1];
                k--;
            } else {
                cnt++;
                if(i+1==n) break;
                sum = sum - arr[i - k+1] + arr[++i];
            }
            System.out.println("i = " + i+", k = "+k+", sum = "+sum);
        }
        return cnt;
    }
    public static int solution2(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt = 0;
        //sum값이 변경될때마다 확인@
        for (int rt = 0; rt < n; rt++) {    //rt가 0부터 끝까지 쭉 돌면서 lt가 쫓아오면 됨
            sum+=arr[rt];
            if(sum==m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];   //lt값을 빼고 lt증가
                if(sum==m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, m, arr));
    }
}
