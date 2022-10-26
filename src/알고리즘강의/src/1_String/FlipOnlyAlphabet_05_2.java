import java.util.Scanner;

public class FlipOnlyAlphabet_05_2 {
    public static String solution(String str){
       //1. 문자배열로 변환
        char[] s = str.toCharArray();
        //2. 알파벳만 뒤집기
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;    //알파벳이 아닐때
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
