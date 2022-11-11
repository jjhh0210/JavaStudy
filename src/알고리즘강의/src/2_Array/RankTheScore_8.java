import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankTheScore_8 {
    public static int[] solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();    //for Collections.max 함수 사용
        for (int x : arr) {
            list.add(x);
        }
        int[] rank = new int[n];
        int max = Collections.max(list);
        int ranking = 1;
        int cnt = 0;
        while (max != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {    //max점수들 동일한 등수 처리
                    rank[i] = ranking;
                    list.set(i, -1);    //처리한 점수는 -1값으로 변경
//                    System.out.println(list.toString());
                    cnt++;
                }
            }
            ranking+=cnt;
            cnt=0;
            max = Collections.max(list);
        }

        return rank;
    }
    public static int[] solution2(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank=1;
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j])
                    rank++;
            }
            answer[i] = rank;
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
        for(int x :solution2(n, arr)) System.out.print(x+" ");

    }
}
