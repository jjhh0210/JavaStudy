import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExtractCommonElement_2 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        //1. 두 배열 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        //2. 투 포인터 비교 - 원소 작은 쪽 인덱스 증가,같으면 add 후 인덱스 둘 다 증가
        while (i < n && j < m) {    
            if(a[i]<b[j]) i++;      
            else if(a[i]>b[j]) j++;
            else{   //같은 경우
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;
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
