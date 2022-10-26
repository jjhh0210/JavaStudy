import java.util.Vector;

//Vector클래스로 객체배열 다루기
public class PolyArgumentTest3 {

    public static void main(String[] args) {
        Buyer3 b = new Buyer3(1000);
        Bed bed = new Bed();
        Desk desk = new Desk();

        b.buy(bed, 3);
        b.buy(desk, 2);
        b.summary();
        System.out.println();
        b.refund(bed);
        b.summary();
    }
}
class Buyer3{
    int money;
    int bonusPoint = 0;
    Vector items = new Vector();    //Vector객체 생성 == 동적객체배열 생성(default 사이즈 : 10)

    Buyer3() {
        this(1000);
    }

    Buyer3(int money) {
        this.money = money;
    }

    void buy(Product p,int num) {
        p.num = num;
        if (money < p.price*p.num) {
            //사려는 제품의 가격이 소유금액보다 많을 때
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            return; //현재 실행중인 메서드 종료하고 호출한 메서드로 돌아간다!
        }
        money = money - p.price*p.num;
        bonusPoint = bonusPoint + p.bonusPoint*p.num;
        System.out.println(p+"을(를)"+ p.num+"개 구매하셨습니다.(가격:"+p.price*p.num+")");
        items.add(p);
    }

    void refund(Product p) {
        //제거 성공
        if (items.remove(p)) {
            money += p.price * p.num;
            bonusPoint -= p.bonusPoint * p.num;
            System.out.println(p + "을(를)" + p.num + "개 반품하셨습니다.(가격:"+p.price*p.num+")");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sumPrice=0;         //구매 물품의 가격합계
        int sumBonusPoint=0;
        String itemList = "";   //구매 물품 목록

        if (items.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return; //메서드 종료, 호출된 메서드로 돌아감
        }

        //구매 물품의 총 가격, 총 적립 포인트과 목록 출력
        for (int i = 0; i < items.size(); i++) {
            Product p = (Product) items.get(i); //get()메서드의 반환타입이 Object이므로 적절한 형변환(다운캐스팅)필요
            sumPrice += p.price*p.num;
            sumBonusPoint += p.bonusPoint*p.num;
            itemList += (i == 0) ? p + "(" + p.num + ")" : ", " + p + "(" + p.num + ")";   //이거 쓸라면 toString()반드시 오버라이딩 되어있어야~
        }
        System.out.println("- 구매물품: "+itemList);
        System.out.println("- 총 금액: "+ sumPrice +"원");
        System.out.println("- 총 적립 금액: "+ sumBonusPoint+"점");
        System.out.println("- 남은 돈: "+money+"원");
    }
}