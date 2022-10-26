import java.util.Scanner;

public class DeleteDuplication_06 {
    public static String solution(String str) {
        //asssdfasdf -> asdf
        String answer = "";
        /*My Solution*/
//        int pos;
//        for (int i = 0; i < str.length(); i++) {
//            char tmp = str.charAt(i);
//            //answer에 해당 문자 tmp가 없으면  answer에 추가
//            if(answer.indexOf(tmp)==-1)
//                answer+=tmp;
//        }
//        return answer;

        /*Other Sol*/
        //문자열에서 문자c의 실제 인덱스 i와 indexOf(c)의 값이 다르면 중복문자라고 판단
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(i==str.indexOf(str.charAt(i)))
                answer += str.charAt(i);
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
