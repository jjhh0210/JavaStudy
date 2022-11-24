import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class MiroBFS_11 {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] board, dis;
    public static void BFS(int x, int y){
        /*My풀이 - 그냥 레벨 이용*/

        //1. 루트,레벨, 큐 초기화
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        int L = 0;
        board[x][y] = 1;    //출발점도 체크

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
                        if(nx==7&&ny==7) System.out.println(L+1);
                        board[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }
        if (board[7][7] != 1) { //bfs탐색 다 마쳤는데 7,7까지 도달 못한경우
            System.out.println(-1);
        }

    }

    public static void BFS2(int x, int y){
        /*dis배열 이용*/
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1;

        while (!Q.isEmpty()) {
            Point tmp = Q.poll();   //현재 좌표
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i]; //다음좌표
                int ny = tmp.y + dy[i];
                if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;    //다음좌표까지의 길이는 현재좌표+1
                }
            }
        }
        //dis 배열 한번 출력해보기~
        for (int[] i : dis) {
            for (int j : i) {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        dis=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        BFS2(1, 1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
