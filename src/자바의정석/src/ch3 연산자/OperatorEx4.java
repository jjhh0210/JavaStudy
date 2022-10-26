public class OperatorEx4 {
    public static void main(String[] args) {
        int a = 1_000_000; //1000000 백만
        int b = 2_000_000; //2000000 이백만
        long c;
        
        c = a*b; //연산 결과가 int 범위 넘어서 -145759936 이란 쓰레기값이 long타입 c에 담긴다
        System.out.println("c = " + c); //c = -1454759936

        c = a*(long)b;  //a와 b가 long으로 형변환 후 계산됨
        System.out.println("c = " + c); //c = 2000000000000

    }
}
