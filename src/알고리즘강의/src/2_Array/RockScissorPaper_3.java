import java.util.Scanner;

public class RockScissorPaper_3 {
    public static String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < a.length; i++) {
            //A가 이기는 경우
            if (a[i] - b[i] == 1 || a[i] - b[i] == -2) answer += "A";
            //비기는경우
            else if (a[i] == b[i]){ answer += "D";}
            //나머지 - B가 이기는 경우
            else answer += "B";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
