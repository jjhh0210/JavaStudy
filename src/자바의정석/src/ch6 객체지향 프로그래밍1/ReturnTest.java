public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();
        int result = r.add(3, 5);
        System.out.println("add result = " + result);

        int[] result2 = {0,0,0};    //사실상 배열을 이용하면 add,sub,mult 등의 여러 연산 결과를 한번에 반환받는 효과 있음
        r.add(3, 5, result2);
        System.out.println("add result = " + result2[0]);
        System.out.println("sub result = " + result2[1]);
        System.out.println("mult result = " + result2[2]);
    }

    //static이 없으므로 ReturnTest타입의 인스턴스 생성 후 메서드 사용 가능
    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a+b;
        result[1] = a-b;
        result[2] = a*b;
    }
}
