public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        Data d2 = copy(d);

        System.out.println("d.x = "+d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d) {  //반환타입: Data (즉, 반환값은 tmp 객체의 주소임)
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
