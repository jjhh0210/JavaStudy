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
//        //배열출력
//        for(int i=0; i<map.length; i++){
//            for(int j=0; j<map[i].length; j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
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
        //봉우리 출력
//        System.out.println();
//        for(int i=0; i<mountain.length; i++){
//            for(int j=0; j<mountain.length; j++){
//                System.out.print(mountain[i][j] + " ");
//            }
//            System.out.println();
//        }

        return cnt;
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
