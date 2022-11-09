import java.util.Arrays;
import java.util.Scanner;

public class RankTheScore_8 {
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int[] sorted = Arrays.copyOf(arr, n);   //arr.clone();도 가능
        System.out.println(Arrays.toString(sorted));
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));

        for (int i = 0; i < n; i++) {
            int j = findIndex(arr,sorted[i]);
            System.out.println("sorted["+i+"]="+sorted[i]+", j="+j);
            answer[j] = n-i;    //n--;안됨 주의(for i<n에 영향 줌)
        }
        return answer;
    }

    private static int findIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x :solution(n, arr)) System.out.print(x+" ");

    }
}
