import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChooseClassPresident_11 {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int[][] mat = new int[n+1][n+1];    //학생x학생(1번부터 시작)인덱스 0은 쓰지 않음
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
        //각 학생별 같은반이었던 학생 수가 몇인지 세고 최댓값 찾기
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= 5; j++) {
                sum += mat[i][j];
            }
            System.out.println(i+"번째 학생의 같은반 학생 수: "+sum);
            if (max < sum) {
                max = sum;
                answer = i;
            }
        }
        return answer;   //같으면 가장 앞의 인덱스!
    }

    public static int solution2(int n, int[][] arr) {
        int answer= 0;
        int max = Integer.MIN_VALUE;
        int cnt; //i번째 학생별 같은반이었던 학생 수
        for (int i = 1; i <=n; i++) {   //i번째 학생
            cnt=0;
            for (int j = 1; j <=n ; j++) {  //j번째 학생과
                for (int k = 1; k <=5; k++) {   //k학년일 때 같은 반인 적이 있는가
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;  //여러번 같은 반인 경우 중복으로 세지 않기 위해 바로 빠져나옴
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
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
        System.out.print(solution2(n, arr));
    }
}
