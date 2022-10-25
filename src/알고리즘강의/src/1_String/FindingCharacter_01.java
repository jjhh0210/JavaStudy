import java.util.Scanner;

public class FindingCharacter_01 {
    public static int solution(String str, char t){
        //1-1. 문자찾기
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /*for(int i=0;i<upstr.length();i++){
            if(upstr.charAt(i)==upt)
                answer++;
        }*/

        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);
        System.out.println(solution(input1,input2));
    }
}
