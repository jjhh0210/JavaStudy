public class InnerEx1 {
    public static void main(String[] args) {
//        myMethod();       //인스턴스 메소드(멤버)니까 static 메서드(메인 포함)에서 호출할 수 없음!!! 객체 생성해야함

    }

    class InstanceInner {
        int iv = 100;
        final static int CONST = 200;   //final static 변수는 모든 클래스에서 가능(상수의 의미)
//        static int sv = 2;  //static 변수는 only static class에서만 가능

        void instanceInnerMethod() {
//            int n = StaticInner.iv + 100; //StaticInner.iv는 쓸 수 없음
            int n = StaticInner.sv + 100;
        }
    }

    static class StaticInner {
        int iv = 300;
        static int sv = 400;
    }

    void myMethod() {
        class LocalInner {
            int iv = 500;
        }
    }
}
