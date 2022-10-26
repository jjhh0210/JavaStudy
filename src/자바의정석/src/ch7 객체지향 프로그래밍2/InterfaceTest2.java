public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay();
    }
}

interface I {
    void play();
}

class InterfaceManager {
    //인스턴스 제공!
    public static I getInstance() {
        return new B();
    }
}

class A {
    //InterfaceManager로 I구현한 클래스의 인스턴스(B)를 제공받기
    void autoPlay() {
        I i = InterfaceManager.getInstance();   //i는 B 인스턴스를 참조할 것임
        i.play();
    }

}

class B implements I {
    public void play() {
        System.out.println("play in class B");
    }
}

class C implements I{
    public void play() {
        System.out.println("play in class C");
    }
}
