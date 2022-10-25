public class MemberCall {
    int iv = 10;
    static int cv = 20;
    
    int iv2 = cv;   //인스턴스변수는 클래스변수 사용 가능
    //    static int cv2 = iv; //에러! 클래스변수는 인스턴스 변수 사용 불가
    static int cv2 = new MemberCall().iv;   //이렇게 객체 생성 후 사용 가능

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); //에러! 클래스 메서드-> 인스턴스 변수 바로 사용 불가능
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   //객체 생성 후에야 인스턴스변수 참조 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); //인스턴스 메서드-> 인스턴스 바로 직접 사용 가능
    }

    static void staticMethod2() {
        staticMethod1();    //클래스 메서드 -> 클래스메서드 호출 가능
//        instanceMethod();   //에러! 클래스 메서드 -> 인스턴스 메서드 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1(); //객체 생성 후 인스턴스 메서드 호출 가능
        //위에 두 줄 줄이면
        new MemberCall().instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();  //인스턴스메서드 -> 클래스,인스턴스 메서드 모두 바로 호출 가능
    }
}

