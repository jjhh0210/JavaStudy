import java.util.Scanner;

public class NXNBoard_9 {
    public static int solution(int n, int[][] arr){
        int answer;
        int max = 0;
        int rowSum,colSum;
        int crossSum1 = 0;
        int crossSum2 = 0;
        
        //각 i번째 row의 합, col의 합 구해서 비교 후 max 갱신
        for (int i = 0; i < n; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            max = Math.max(max, rowSum); //세개의 수를 간단히 비교하는법! rowSum과 max중의 max값과 colSum을 비교
            max = Math.max(max, colSum);
        }
        //2. 두 대각선의 합 구한 후 비교
        for (int i = 0; i < n; i++) {
            crossSum1 += arr[i][i];
            crossSum2 += arr[i][n - 1 - i];
        }
        answer = max(crossSum1, crossSum2, max);
        return answer;
    }

    private static int max(int n1, int n2, int n3) {
        return n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }

}
