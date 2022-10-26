public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();    ->에러! 인스턴스 생성 권한 x
        Singleton s = Singleton.getInstance();
    }
}
final class Singleton{
    //final 클래스 -> 상속 불가능한 클래스
    private static Singleton s = new Singleton();   //같은 클래스 내부에선 인스턴스 생성 가능

    private Singleton() {
        //생성자가 private -> 외부에서 인스턴스 생성 불가능
    }

    public static Singleton getInstance() {
        //외부에서 접근 가능하게 public,인스턴스 생성 없이 메서드 호출 할 수 있게 static
        if (s == null) {
            s = new Singleton();    //인스턴스 생성
        }
        return s;   //인스턴스 반환
    }
}
