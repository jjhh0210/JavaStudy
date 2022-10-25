public class OperatorEx3 {
    public static void main(String[] args) {
        //p.99
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); //그냥 byte c = a+b; 하면 a+b가 int+int이므로 에러! byte로 명시적 형변환 해줘야
        System.out.println("c = " + c); //c = 30

        byte d = (byte) (a * b);    //200은 byte형의 범위를 벗어나므로 값손실 발생
        System.out.println("d = " + d); //d = -56
    }

}
