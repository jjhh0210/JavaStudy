import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChooseClassPresident_11 {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int sum = 0;
        int[][] mat = new int[n+1][n+1];
        printArray(arr);

        for (int i = 1; i <= n; i++) {  //학생
            for (int j = 1; j <= 5; j++) {  //학년
                for (int k = i+1; k <= n; k++) {    //i학생의 j학년별 같은반 학생 찾기
                    if (arr[i][j] == arr[k][j] && mat[i][k] == 0) {
                        mat[i][k]=1;
                        mat[k][i]=1;
                    }
                }
            }
        }
        printArray(mat);
        //각 학생별 한번이라도 같은반이었던 학생 수
        ArrayList<Integer> sumList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum += mat[i][j];
            }
            sumList.add(sum);
            sum=0;
        }
        //max값을 가진 학생(index+1) 찾기
        System.out.println(sumList.toString());
        int max = Collections.max(sumList);
        return answer = sumList.indexOf(max)+1;   //같으면 가장 앞의 인덱스!
    }

    public static void printArray(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }
}
