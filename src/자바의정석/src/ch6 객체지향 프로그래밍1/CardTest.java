public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1: " + c1.kind + ", " + c1.number + ", width = " + c1.width + ", height = " + c1.height);
        System.out.println("c2: " + c2.kind + ", " + c2.number + ", width = " + c2.width + ", height = " + c2.height);
        System.out.println("c1의 width와 height를 각각 50,80으로 변경(클래스변수 값 변경)");
        //Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조하므로 항상 같은값이다
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1: " + c1.kind + ", " + c1.number + ", width = " + c1.width + ", height = " + c1.height);
        System.out.println("c2: " + c2.kind + ", " + c2.number + ", width = " + c2.width + ", height = " + c2.height);


    }
}
