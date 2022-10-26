public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0); //맨 앞에있는 카드 뽑기(SPADE,1)
        System.out.println(c);

        d.shuffle();    //카드 섞기 후 맨 앞 카드 뽑기
        c = d.pick(0);
        System.out.println(c);
        c = d.pick();   //완전 랜덤 뽑기
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        int i=0;
        //Card(int kind, int number)객체 생성 -> Card(1,1)~Card(1,13) ~~~~Card(4,13)까지 -> 52개!
        for (int k = 1; k <= Card.KIND_MAX; k++) {
            for (int n = 1; n <= Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n);
            }
        }
    }

    Card pick(int i) {
        //오버로딩
        return cardArr[i];
    }

    Card pick() {
        int i = (int) (Math.random() * CARD_NUM); //cardArr[0]~[51]중 하나 뽑음
//        return cardArr[i];
        return pick(i);
    }

    void shuffle() {
        int n=0;
        for (int i = 0; i < CARD_NUM; i++) {
            n = (int)(Math.random()*CARD_NUM);  //0~51중 랜덤위치
            Card tmp = cardArr[n];
            cardArr[n] = cardArr[i];
            cardArr[i] = tmp;
        }
    }

}

class Card {
    static final int KIND_MAX = 4; //카드 무늬 수
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4; //static: 모든 인스턴스마다 공통된 값,final: 값이 변하지 x
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;   //카드 무늬 종류 - 번호로 지정
    int number; //카드 번호 - 얘 또한 번호로 지정

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "SPADE","DIAMOND","HEART","CLOVER"};
        String numbers = "0123456789XJQK";  //10,11,12,13 = X,J,Q,K
        return "kind: " + kinds[kind] + ", number : " + numbers.charAt(number);
    }
}
