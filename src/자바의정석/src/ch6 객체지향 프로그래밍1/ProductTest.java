public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 serial no:"+p1.serialNo);
        System.out.println("p2의 serial no:"+p2.serialNo);
        System.out.println("p3의 serial no:" + p3.serialNo);
        System.out.println("총 제품 수: "+Product.count);
    }
}
class Product{
    static int count = 0;   //cv, 제품 수 -> instance 변수로 선언했다면 인스턴스 생성 될 때마다 0으로 초기화 될것
    int serialNo = 0;       //iv

    //instance initial block - 모든 생성자가 공통으로 수행해야 할 작업들!
    {
        ++count;    //모든 인스턴스가 이 값을 공통으로 가짐!! ->즉, 인스턴스 생성 될 때마다 count증가
        serialNo = count;
    }
    //기본 생성자
    Product() {

    }
}
