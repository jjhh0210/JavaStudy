import java.util.Scanner;

public class MiroDFS_10 {
    static int[] dx = {0, 1, 0, -1};    //12시부터 시계방향
    static int[] dy = {1, 0, -1, 0};
    static int[][] board;
    static int answer=0;

    public static void DFS(int x, int y){
        if (x == 7 && y == 7){ answer++;}
        else{
            for (int i = 0; i < 4; i++) {
                //시계방향 돌기
                int nx = x + dx[i]; //nx,ny = next x , y
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    //격자 안이면서 0인 곳이면 호출
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;  //탐색 끝나서 back되면 체크 다시 풀어줘야함
                }
            }
        }


    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        board[1][1]=1;
        DFS(1, 1);
        System.out.print(answer);
    }
}
