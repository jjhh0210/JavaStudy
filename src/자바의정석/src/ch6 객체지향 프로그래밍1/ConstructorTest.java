public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); //에러 발생-> 기본 생성자 따로 정의해줘야 한다
        Data2 d2 = new Data2(10);

        System.out.println(d1.value=1); //1
        System.out.println(d2.value);   //10
    }
}

class Data1{
    int value;
}

class Data2 {
    int value;

    //생성자 정의
    Data2(int x) {
        value = x;
    }
}
