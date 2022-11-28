import java.util.Scanner;

public class Territory2versionDFS {
    static int n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dx2 = {-1, 0, 1, 0};
    static int[] dy2 = {0, 1, 0, -1};

    public static void DFS(int x, int y, int[][] board, int[] dx, int[] dy) {
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            //격자판 안에 있고, 값이 1이라면 탐색
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board, dx, dy);
            }
        }
    }

    public static int[] solution(int[][] board) {
        int[] answer = new int[2];
        int[][] board2 = new int[board.length][board[0].length];
//        int[][] board2 = board.clone(); //1차원배열.clone -> 깊은복사, 2차원배열.clone -> 얕은복사
        //2차원 배열 복사!! 중요
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i],0,board2[i],0,board.length);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer[0]++;
                    board[i][j] = 0;    //탐색 시작 위치 0으로
                    DFS(i, j, board,dx,dy);
                }
                if (board2[i][j] == 1) {
                    answer[1]++;
                    board2[i][j] = 0;    //탐색 시작 위치 0으로
                    DFS(i, j, board2,dx2,dy2);
                }
            }
        }
        return answer;
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
        int[] ans = solution(arr);
        for (int x : ans) {
            System.out.println(x+" ");
        }
    }
}
