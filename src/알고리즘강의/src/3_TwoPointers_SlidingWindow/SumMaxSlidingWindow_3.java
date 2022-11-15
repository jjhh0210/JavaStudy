import java.util.Scanner;

public class SumMaxSlidingWindow_3 {
    public static int solution(int n, int k, int[] arr) {
        int windowSum = 0;
        //windowSum초기화
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int max = windowSum;
        //윈도우 밀기 - windowSum 갱신
        for (int i = k; i < n; i++) {
            windowSum = windowSum+ arr[i] - arr[i - k];
            System.out.println("windowSum = " + windowSum);
            if (max < windowSum) max = windowSum;   //max = Math.max(max,windowSum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }
}
