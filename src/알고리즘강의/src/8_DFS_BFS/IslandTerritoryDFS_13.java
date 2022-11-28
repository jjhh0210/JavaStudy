import java.util.Scanner;

public class IslandTerritoryDFS_13 {
    static int answer=0, n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dx2 = {-1, 0, 1, 0};
    static int[] dy2 = {0, 1, 0, -1};

    public static void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            //격자판 안에 있고, 값이 1이라면 탐색
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }

    }

    public static void solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;    //탐색 시작 위치 0으로
                    DFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }
}
