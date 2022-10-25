public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2(1000);
        b.buy(new Bed(), 3);
        b.buy(new Desk(), 1);
        b.summary();
    }

}

class Buyer2{
    int money;
    int bonusPoint = 0;
    Product[] items = new Product[10];  //구매 제품을 저장하기 위한 배열 추가!(참조변수 배열)
    int i = 0;  //for 배열 인덱스

    Buyer2() {
        this(1000);
    }

    Buyer2(int money) {
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
        System.out.println(p+"을(를)"+ num+"개 구매하셨습니다.(가격:"+p.price*p.num+")");
        items[i++] = p;
    }

    void summary() {
        int sumPrice=0;              //구매 물품의 가격합계
        int sumBonusPoint=0;
        String itemList = "";   //구매 물품 목록
        //구매 물품의 총 가격, 총 적립 포인트과 목록 출력
        for (int i = 0; i < items.length; i++) {
            if(items[i]==null)
                break;
            sumPrice += items[i].price*items[i].num;
            sumBonusPoint += items[i].bonusPoint*items[i].num;
            itemList += items[i] +"("+ items[i].num+")"+ ", ";   //이거 쓸라면 toString()반드시 오버라이딩 되어있어야~
        }
        System.out.println("구매물품: "+itemList);
        System.out.println("총 금액: "+ sumPrice +"원");
        System.out.println("총 적립 금액: "+ sumBonusPoint+"점");
    }
}