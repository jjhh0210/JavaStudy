import java.util.*;

public class FindingKthSumByTreeSet_5 {
    public static int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());   //내림차순으로 자동정렬!

        //1. 3장의 카드뽑아서 합을 트리셋에 저장(조합)
        for (int i = 0; i < n; i++) {           //범위를<n-2,n-1,n까지 해도 되는데 어차피 거짓돼서 빠져나오기떄문에 n으로통일
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        //System.out.println(set.first());  //152
        //System.out.println(set.last());   //39
        //System.out.println(set.subSet(130,100));  //130~101

        //2. 중복없이 역정렬된 set에서 k번째로 큰 수 검색
        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) {
                return x;
            }
            System.out.println(x);
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
        System.out.println(solution(arr, n, k));
    }
}
