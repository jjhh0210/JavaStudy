import java.util.Scanner;
import java.util.Stack;

public class CrainKakao_3 {
    public static int solution(int[][] board, int[] moves){
        int cnt = 0;
        int doll = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    doll = board[j][moves[i] - 1];
                    //System.out.println(doll);
                    if (!st.empty() && st.peek() == doll){
                        st.pop();
                        cnt=cnt+2;
                    }
                    else{
                        st.push(doll);  //stack이 비었거나 st.peek()이랑 안 똑같을때 push
                    }
                    board[j][moves[i] - 1] = 0;
                    break;  //중요) 인형 찾았으면 break되어야함!
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(solution(board, moves));
    }
}
