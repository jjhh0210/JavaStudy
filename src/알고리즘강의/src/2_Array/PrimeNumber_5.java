import java.util.Scanner;

public class PrimeNumber_5 {
    public static int solution(int n) {
        int count = 0;  //소수 개수 카운트
        int[] ch = new int[n + 1];  //크기를 n+1로 생성해야 n번 인덱스까지 생김
//        Arrays.fill(ch, 0); //모든 배열의 원소 초기화 -> int배열은 0이 디폴트로 초기화됨
        for (int i = 2; i < ch.length; i++) {
            //소수이면
            if (ch[i] == 0) {
                count++;
                for (int j = i*2; j < ch.length; j+=i) {    //i씩 증가 주의, i*2부터가 i(소수)의 배수임 주의
                    //소수(i)의 배수는 모두 1로 체크
                    ch[j] = 1;
                }
            }
        }
        //소수만 출력해보기
        for (int i = 2; i < ch.length; i++) {
            if(ch[i]==0) System.out.print(i + " ");
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(solution(n));

    }
}
