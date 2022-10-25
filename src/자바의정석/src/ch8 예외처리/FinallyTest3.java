public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println(" method1 -> main으로 돌아옴!");
    }

    static void method1() {
        try {
            System.out.println("method1이 호출됨");
            throw new Exception("method1에서 예외 발생");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally{
            System.out.println("method1의 finally블럭 실행됨");
        }
    }
}
