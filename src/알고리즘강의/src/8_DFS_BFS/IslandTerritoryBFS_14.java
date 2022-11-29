import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandTerritoryBFS_14 {
    static int answer=0, n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> q = new LinkedList<>();

    public static void BFS(int x, int y, int[][] board) {
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
        for (int[] arr : board) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    q.offer(new Point(i, j));
                    BFS(i, j, board);
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
