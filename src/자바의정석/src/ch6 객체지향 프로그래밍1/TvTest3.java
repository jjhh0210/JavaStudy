public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1.channel = " + t1.channel);   //0
        System.out.println("t2.channel = " + t2.channel);   //0

        t2 = t1; //t1이 가리키는 인스턴스를 t2도 가리키게 됨 (원래 t2인스턴스는 추후 제거됨)
        t1.channel = 7;
        System.out.println("t1.channel = " + t1.channel);   //7
        System.out.println("t2.channel = " + t2.channel);   //7

    }
}
