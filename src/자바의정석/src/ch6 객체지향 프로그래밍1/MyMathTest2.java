public class MyMathTest2 {
    public static void main(String[] args) {
        //클래스 메서드 호출(인스턴스 생성 없이 사용가능!)
        System.out.println("By Class Method");
        System.out.println(MyMath2.add(200, 100));
        System.out.println(MyMath2.sub(200L, 100L));
        System.out.println(MyMath2.mult(200L, 100L));
        System.out.println(MyMath2.div(200, 100));  //int -> long -> 결과는 double로 형변환됨

        System.out.println("By Instance Method");
        MyMath2 mm = new MyMath2(); //instance생성
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.sub());
        System.out.println(mm.mult());
        System.out.println(mm.div());


    }

}

class MyMath2 {
    long a, b;  //인스턴스 변수(인스턴스마다 독립적인 값 가질 수 있으니까)

    long add() {    //인스턴스 메서드(인스턴스 변수 a,b만을 이용해서 작업. 매개변수 필요 없음)
        return a + b;}

    long sub() {
        return a - b;
    }

    long mult() {
        return a * b;
    }

    double div() {
        return a/b;
    }

    //static 메서드(인스턴스 변수와 관계 없이, 사용없이! 매개변수만으로 작업 가능)
    static long add(long a, long b) {
        return a+b;
    }
    static long sub(long a, long b) {
        return a-b;
    }
    static long mult(long a, long b) {
        return a*b;
    }
    static double div(long a, long b) {
        return a/(double)b;
    }

}
