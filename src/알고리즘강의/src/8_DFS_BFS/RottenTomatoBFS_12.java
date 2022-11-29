import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenTomatoBFS_12 {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> Q=new LinkedList<>();
    public static void BFS(){
        //레벨만으로 하기
        int L = 0;
        boolean flag = false;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0) {
                        if(!flag){
                            L++;    //주의!탐색이 진행된 경우에 한번만 레벨 증가
                            flag = true;
                        }
                        board[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }
            //여기다 L++하면 안됨(탐색이 끝난경우에도 L이 한번더 증가하기 때문)
            flag = false;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(L);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        m=kb.nextInt();
        n=kb.nextInt();
        board=new int[n][m];
        dis=new int[n][m];
        boolean flag = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j]=kb.nextInt();
                if(board[i][j]==1) Q.offer(new Point(i, j));
                else if(board[i][j]==0) flag= true; //0이 하나라도 있으면 모든 토마토가 익어있는 상태는 아님!
            }
        }
        if (flag) {
            BFS();  //안 익은 토마토가 하나 이상 있는경우
        }else{
            System.out.println(0);  //모두 익은 토마토인 경우
        }
    }
}
