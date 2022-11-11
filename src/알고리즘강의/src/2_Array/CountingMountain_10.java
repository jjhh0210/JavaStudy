import java.util.Scanner;

public class CountingMountain_10 {
    public static int solution(int n, int[][] arr){
        int cnt = 0;
        //1. 지도 만들기
        int[][] map = new int[n + 2][n + 2];
        int[][] mountain = new int[n + 2][n + 2];   //봉우리 출력용!
        for (int i = 1; i <= map.length - 2; i++) {
            for (int j = 1; j <= map[i].length - 2; j++) {
                map[i][j] = arr[i-1][j-1];
            }
        }
        printArray(map);
        //2. 봉우리 세기
        for (int i = 1; i <= map.length - 2; i++) {
            for (int j = 1; j <= map[i].length - 2; j++) {
               if(map[i-1][j]<map[i][j]&&map[i+1][j]<map[i][j]&&map[i][j-1]<map[i][j]&&map[i][j+1]<map[i][j]){
                   //상하좌우보다 크면
                   cnt++;
                   mountain[i][j] = map[i][j];
                   j++;
               }
            }
        }
        printArray(mountain);
        return cnt;
    }

    public static int solution2(int n, int[][] arr) {
        //방향배열 이용하기~
        int cnt = 0;
        int[] dx = {-1, 0, 1, 0};   //12시,3시,6시,9시
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    //만약 상하좌우가 가장자리면(인덱스 밖이면) -> 비교안하고 건너뛰어야됨
                    //가장자리 아니고, 값이 arr[i][j]보다 크거나 같으면 봉우리가 아님
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;
            }
        }
        return cnt;
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
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution2(n, arr));
    }
}
