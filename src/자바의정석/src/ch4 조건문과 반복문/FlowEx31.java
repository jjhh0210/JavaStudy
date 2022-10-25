public class FlowEx31 {
    public static void main(String[] args) {
        //3의 배수는 출력 안하기 예제
        for (int i = 1; i <= 100; i++) {
            if(i%3==0)
                continue;
            System.out.println(i);
        }
    }
}
