import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex1012_Baechoo {
    // 배추밭의 가로 길이(x)
    private static int M;
    // 배추밭의 세로 길이(y)
    private static int N;
    // 배추밭
    private static int[][] area;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static Queue<Point> q = new LinkedList<>();


    //1. DFS
    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N && area[nx][ny] == 1) {
                area[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }

    static void bfs(int x, int y) {
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < M && ny < N && area[nx][ny] == 1) {
                    area[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 케이스 수
        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            String[] temp = reader.readLine().split(" ");
            M = Integer.parseInt(temp[0]);
            N = Integer.parseInt(temp[1]);
            // 배추 갯수
            int K = Integer.parseInt(temp[2]);
            area = new int[M][N];
            //isVisit = new boolean[M][N];
            // 필요한 배추흰지렁이 수
            int bugs = 0;
            for (int j = 0; j < K; j++) {
                temp = reader.readLine().split(" ");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                area[x][y] = 1;
            }
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (area[x][y] == 1) {
                        area[x][y] = 0;
                        bugs++;
                        //dfs(x, y);
                        q.offer(new Point(x, y));
                        bfs(x, y);
                    }
                }
            }
            System.out.println(bugs);
        }
        reader.close();
    }
}
class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
