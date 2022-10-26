public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();

    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20; //조상의 멤버변수 이름과 중복 가능
    void method() {
        System.out.println("x = " + x);             //20
        System.out.println("this.x = " + this.x);   //20
        System.out.println("super.x = " + super.x); //10
    }

}
