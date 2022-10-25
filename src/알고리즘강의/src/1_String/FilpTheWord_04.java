import java.util.Scanner;

public class FilpTheWord_04 {
    public static String[] solution(String[] arr) {
        String[] answer = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for(String s : solution(arr)){
            System.out.println(s);
        }
    }
}
