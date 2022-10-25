public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer(500);   //고객생성
        b.printMoney();
        System.out.println();
        b.buy(new Bed(),3);           //침대구매
        b.buy(new Desk(), 1);           //책상 구매
    }
}

class Product {
    int price;
    int bonusPoint;
    int num = 1;    //구매 갯수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); //보너스 포인트 =  제품가격의 10%
    }
}

class Bed extends Product {
    Bed() {
        super(100);
    }

    public String toString() {
        return "침대";
    }   //얘는 오버라이딩 된거임!
}

class Desk extends Product {
    Desk() {
        super(200);
    }

    public String toString() {
        return "책상";
    }
}
class Buyer{
    //고객, 물건 사는 사람
    int money;          //소유 금액
    int bonusPoint = 0; //총 보너스 좀수

    Buyer() {
        this(1000);
    }

    Buyer(int money) {
        this.money = money;
    }

    void buy(Product p,int num) {
        p.num = num;
        if (money < p.price*p.num) {
            //사려는 제품의 가격이 소유금액보다 많을 때
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            printMoney();
            return; //현재 실행중인 메서드 종료하고 호출한 메서드로 돌아간다!
        }
        money = money - p.price*p.num;
        bonusPoint = bonusPoint + p.bonusPoint*p.num;
        System.out.println(p+"을(를)"+ num+"개 구매하셨습니다.(가격:"+p.price*p.num+")");
        printMoney();
        printBonusPoint();
    }

    void printMoney() {
        System.out.println(" - 현재 남은 돈: "+money+"만원");
    }

    void printBonusPoint() {
        System.out.println(" - 현재 보너스 포인트: "+bonusPoint+"점");
    }
}
