public class BindingTest {
    public static void main(String[] args) {
        Mom m = new Daughter();         //m = (Mom/Daughter)
        Daughter d = new Daughter();    //d = (Daughter/Daughter)

        System.out.println("m.x = " + m.x); //100 (참조변수의 타입을 따른다)
        m.method(); //자손클래스 (실제 인스턴스의 타입을 따른다)
        System.out.println("d.x = " + d.x); //200
        d.method(); //자손클래스
    }
}

//class Mom {
//    int x = 100;
//
//    void method() {
//        System.out.println("부모 클래스");
//    }
//}
//
//class Daughter extends Mom {
//    int x = 200;//조상,자손클래스간의 멤버변수 중복
//
//    void method() {
//        //메소드 중복(오버라이딩)
//        System.out.println("자손 클래스");
//    }
//}