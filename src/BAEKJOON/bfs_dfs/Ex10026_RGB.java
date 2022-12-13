import java.util.Scanner;

public class Ex10026_RGB {
    static int N;
    static String s;
    static char[][] map;
    static boolean[][] visit;
    static int ans1 = 0, ans2 = 0;  //ans1 = 적록색약 X, ans2 = 적록색약 O
    static int dx[] = {-1,0,0,1};
    static int dy[] = {0,1,-1,0};

    public static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && map[nx][ny] == map[x][y] && !visit[nx][ny]) {
                visit[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

    public static void solution() {
        //1. 적록색약 x - ans1
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) { //visit[i][j]==false이면
                    visit[i][j] = true;
                    ans1++;
                    dfs(i, j);
                }
            }
        }
        //2. 적록색약 O - ans2
        //G->R로 변경
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]=='G') map[i][j] = 'R';
            }
        }
        visit = new boolean[N][N];  //방문배열 초기화 해줘야
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) { //visit[i][j]==false이면
                    visit[i][j] = true;
                    ans2++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(ans1+" "+ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new char[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            s = sc.next(); // RRRBB
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j);    //R R R B B
            }
        }
        solution();

    }

}
