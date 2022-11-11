import java.util.Scanner;

public class Mentoring_12 {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int[][] mat = new int[n][n];

        //1. 첫번째 등수로 멘토 멘티 행렬 초기화
        for (int i = 0; i < n-1; i++) {
            int x = arr[0][i];
            for (int j = i + 1; j < n; j++) {
                int y = arr[0][j];
                mat[x-1][y-1] = 1;
            }
        }
        printArray(mat);
        //2. 두번째 등수부터
        for (int i = 1; i < m; i++) {
            for (int j = n - 1; j >= 1; j--) {
                int x = arr[i][j];
                for (int k = j - 1; k >= 0; k--) {
                    int y = arr[i][k];
                    if(mat[x-1][y-1]==1) mat[x-1][y-1] = 0;
                }
            }
        }
        printArray(mat);
        //3. 모든 경우의 수 세기
        for (int[] x : mat) {
            for (int y : x) {
                answer += y;
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
    public static int solution2(int n, int m, int[][] arr){
        int answer=0;
        for(int i=1; i<=n; i++){    //멘토가 될 i번째 학생(1~4번 학생)
            for(int j=1; j<=n; j++){    //멘티가 될 j번째 학생
                int cnt=0;  //i가 j를 앞선 횟수(pi<pj)
                for(int k=0; k<m; k++){ //k번째 시험에서
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){ //i번째, j번째 학생의 등수찾기
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;    //i가 j보다 앞서면 앞선 횟수 증가
                }
                if(cnt==m){
                    answer++;   //모든 테스트에서 다 앞섰으면 멘토 확정
                    System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution2(n, m, arr));
    }
}
