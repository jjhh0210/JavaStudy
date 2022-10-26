import java.util.Arrays;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
    //Data클래스 대신 배열 이용한 예제(x[0]과 x[2] swap)
        int[] x = {10, 20, 30};
        System.out.println("main : x = "+ Arrays.toString(x));

        change(x);
        System.out.println("after change: x = " + Arrays.toString(x));
    }

    static void change(int[] x) {   //매개변수 타입이 배열-> 참조형 매개변수
        int tmp = x[0];
        x[0] = x[2];
        x[2] = tmp;
        System.out.println("change: x = "+Arrays.toString(x));
    }
}
