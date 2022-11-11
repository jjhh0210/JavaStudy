import java.util.ArrayList;
import java.util.Scanner;

public class FlippedPrimeNumber_6 {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;    //2부터 자기자신 전까지 하나라도 나눠지는 수가 있으면(약수가있으면) 소수가 아님
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            //1. 자연수 뒤집기
            StringBuilder sb = new StringBuilder(arr[i]+"");    //그냥 arr[i] 하면 x, String으로 변환 후 인풋
            int flipped = Integer.parseInt(sb.reverse().toString());
            System.out.print(flipped+" ");
            //2. 뒤집은 수 소수 판별 및 add
            if (isPrime(flipped)) answer.add(flipped);
        }
        System.out.println();

        return answer;

    }

    public static ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //1.숫자 뒤집기
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;    //숫자 뒤집은 결과
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            //2. res가 소수인지 판별
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : solution2(n, arr)){
            System.out.print(x+" ");
        }

    }

}
