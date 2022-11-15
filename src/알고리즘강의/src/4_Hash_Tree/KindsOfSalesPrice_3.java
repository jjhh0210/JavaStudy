import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KindsOfSalesPrice_3 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0;
        int cnt = 0;    //window
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            cnt++;
            if (cnt == k) {
                answer.add(map.size());
                map.put(arr[lt], map.get(arr[lt]) - 1);
                if (map.get(arr[lt]) == 0) {
                    map.remove(arr[lt]);
                }
                lt++;
                cnt--;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : solution(n, k, arr)) System.out.print(x+" ");
    }
}
