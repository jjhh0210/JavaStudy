class Card2 {
    //각 카드마다 다른 종류와 숫자를 갖지만, 카드가 생성되면 카드값이 변경되어서는 안됨
    //따라서 카드의 종류와 숫자는 final변수로, 값은 생성자로 초기화
    final int NUMBER;   //상수지만 선언과 함께 초기화x, 생성자에서!
    final String KIND;
    static int width = 100; //카드 길이, 높이는 모든 카드의 공통된 값 이므로 static 제어자
    static int height = 250;

    Card2(String kind, int num) {
        //매개변수로 넘겨받은 값으로 final 변수 KIND, NUMBER 초기화
        KIND = kind;
        NUMBER = num;
    }

    Card2() {
        //기본 생성자: heart, 1로 초기화
        this("HEART", 1);
    }

    public String toString() {
        return KIND + ", " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("DIAMOND", 4);
        Card2 c2 = new Card2();
//        c.NUMBER = 12; -> 에러! NUMBER는 final 변수이므로 변경불가
        System.out.println(c);
        System.out.println(c2);
    }
}
