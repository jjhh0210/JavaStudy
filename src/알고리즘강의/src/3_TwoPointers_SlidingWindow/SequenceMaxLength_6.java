import java.util.Scanner;

public class SequenceMaxLength_6 {
    public static int solution(int n, int k, int[] arr){
        int max=Integer.MIN_VALUE;      //최대 길이 = answer
        int len = 0;    //연속 부분수열의 길이
        int cnt = 0;    //0을1로 바꾼 횟수
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                if (cnt < k){   //arr[rt]=0이고, cnt<k이면 cnt 증가
                    cnt++;
                    continue;
                }
                //arr[rt]=0이고, cnt=k이면
                len = rt - lt;
                max = Math.max(max, len);
                while (cnt > k - 1) {
                    if(arr[lt]==0) cnt--;
                    lt++;
                }
                cnt++;
            }
        }
        return max;
    }
    public static int solution2(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }
}
