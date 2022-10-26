import java.util.Arrays;
import java.util.Scanner;

public class FindingLongestWord_03 {
    public static String solution(String s){
        /*My Solution*/
//        String answer = "";
//        int max = 0;    //Integer.MIN_VALUE로 초기화할 수 도 있다.
//        String[] arr = s.split(" ");
//        for(String x : arr){
//            if(x.length()>max){ //>=로하면 길이 같을경우 가장 뒤에 있는 단어 선택
//                answer = x;
//                max = x.length();
//            }
//        }
//        return answer;

        /*Other Solution - indexOf(),substring()사용해서 풀기*/
        String answer = "";
        int m = Integer.MIN_VALUE;  //단어 max길이 담을 변수
        int pos;

        while((pos = s.indexOf(' '))!=-1){  //띄어쓰기가 있는동안(띄어쓰기 위치를 못찾아서 -1반환하지 않는 동안)
            String tmp = s.substring(0,pos);//단어 짤라내기
            if(tmp.length()>m){ //단어 길이 비교
                m=tmp.length();
                answer = tmp;
            }
            s = s.substring(pos+1); //문자열 갱신 (It is good -> is good)
        }
        //마지막 단어가 되면 반복문 빠져나오므로 마지막 단어 처리 필수
        if(s.length()>m) answer = s;
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
