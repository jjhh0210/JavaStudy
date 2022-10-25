import java.util.Scanner;

public class FlipOnlyAlphabet_05 {
    public static String solution(String s){
        StringBuilder alphabet = new StringBuilder();   //알파벳만 담을 변수
        char[] chars = s.toCharArray(); 
        String pos = "";    //위치 담을 변수
        
        //1. 알파벳 추출
        for (int i = 0; i < chars.length; i++) {
            if((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                alphabet.append(chars[i]);
                pos+=i+","; //pos+=i만 하면 위치가 0,15 인 경우 "015"로 저장 되니까 구분자가 반드시 필요하다
            }
        }
        //2. 알파벳 위치 String -> String[] 변환
        String[] positions = pos.split(",");
        //3. reverse 알파벳 문자열
        alphabet.reverse();
        //4. reversed 알파벳을 알파벳 위치에다가 넣음
        for (int i = 0; i < positions.length; i++) {
            chars[Integer.valueOf(positions[i])] = alphabet.charAt(i);
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
