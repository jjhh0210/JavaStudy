public class BindingTest3 {
    public static void main(String[] args) {
        Mom m = new Daughter();
        Daughter d = new Daughter();

        System.out.println("m.x = " + m.x); //100 , Mom에 정의되어 있는 멤버인 x이므로 직접 사용 가능, but 참조변수의 타입을 따른다
//        System.out.println("m.y = "+m.y);   //Mom에 정의되지 않은 멤버인 y는 직접 사용 불가
        m.method();

        System.out.println();

        System.out.println("d.x = " + d.x); //200
        System.out.println("d.y = " + d.y);
        d.method();
    }

}
class Mom {
    int x = 100;

    void method() {
        System.out.println("부모 클래스");
    }
}

class Daughter extends Mom {
    int x = 200;    //조상,자손클래스간의 멤버변수 중복
    int y = 300;

    void method() {
        //메소드 중복(오버라이딩)
        System.out.println("x = " + x); //x == this.x == Daughter 클래스의 인스턴스 변수 x
        System.out.println("super.x = " + super.x); //조상인 Mom 클래스의 인스턴스변수 x
        System.out.println("this.x = " + this.x);
        System.out.println("this.y = " + this.y);
    }

    void crying() {
        System.out.println("응애");
    }
}