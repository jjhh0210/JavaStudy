import java.util.Arrays;
import java.util.Scanner;

public class FindingLongestWord_03 {
    public static String solution(String s){
        String answer = "";
        int max = 0;
        String[] arr = s.split(" ");
        for(String x : arr){
            if(x.length()>max){ //>=로하면 길이 같을경우 가장 뒤에 있는 단어 선택
                answer = x;
                max = x.length();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
