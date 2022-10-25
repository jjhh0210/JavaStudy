import java.util.Date;

public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        //toString()을 오버라이딩 안하면 클래스이름 + 16진수해시코드 출력(Object클래스에 정의되어있)
        System.out.println(c1.toString());  //Card@5594a1b5
        System.out.println(c2.toString());  //Card@6a5fc7f7

        //String이랑 Date는 toString이 클래스에 이미 오버라이딩 되어 있음, 문자열 반환
        String str = "KOREA";
        Date today = new Date();

        System.out.println(str);            //KOREA
        System.out.println(str.toString()); //KOREA
        System.out.println(today);          //Wed May 18 17:33:10 KST 2022
        System.out.println(today.toString());   //Wed May 18 17:33:10 KST 2022
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}
