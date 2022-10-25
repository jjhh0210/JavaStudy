public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long a = 5L, b = 3L;
        long result1 = mm.add(a,b);
        long result2 = mm.subtract(5,3); //int값은 long으로 자동형변환 된다
        long result3 = mm.multiply(a,b);
        double result4 = mm.divide(a,b); //long값은 double로 자동형변환 된다!!!
        System.out.println("a = " + a + " b = " + b);
        System.out.println("add result1 = " + result1);
        System.out.println("sub result2 = " + result2);
        System.out.println("mult result3 = " + result3);
        System.out.println("div result4 = " + result4);
    }
}
class MyMath {
    long add(long a, long b) {
        return a+b;
    }
    long subtract(long a, long b) {
        return a-b;
    }
    long multiply(long a, long b) {
        return a*b;
    }
    double divide(double a, double b) {
        return a/b;
    }
}
