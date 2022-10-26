public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();

        fe.water();
        car = fe;   //업캐스팅 : 형변환 생략 o
//        car.water();      조상은 자식을 모름,, 자손의 멤버는 사용 불가
        fe2 = (FireEngine) car; //다운캐스팅 : 형변환 생략 x
        fe2.water();
    }
}
class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive,brr~~");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
