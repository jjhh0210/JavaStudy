import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConcatTwoArrays_1 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n && j<m) {
            //둘 중 작은거 추가
            if(a[i]<b[j]){
                answer.add(a[i++]);
            }else{
                answer.add(b[j++]);
            }
        }
        //다른 남은 배열에 대해서 원소 모두 추가
        while (i < n) answer.add(a[i++]);
        while (j < m) answer.add(b[j++]);
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : solution(n, m, a, b)) System.out.print(x+" ");
    }
}
