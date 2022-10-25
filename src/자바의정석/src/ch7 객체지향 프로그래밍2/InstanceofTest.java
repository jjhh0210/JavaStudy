public class InstanceofTest {
    public static void main(String[] args) {
//        FireEngine fe = new FireEngine();
//        Car fe = new Car();
        Car fe = new FireEngine();    //참조변수가 Car타입이여도 FireEngine 인스턴스이므로 결과 same
        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine Instance");
        }
        if (fe instanceof Car) {
            System.out.println("This is a Car Instance");
        }
        if (fe instanceof Object) {
            System.out.println("This is an Object Instance ");
        }
        System.out.println(fe.getClass().getName());
    }

}
