public class CastingEx3 {
    public static void main(String[] args) {
        double d = 1.0e100;
        float f = (float) d;

        System.out.println("f = " + f); //f = Infinity , float 범위를 넘었기 때문

        f = 9.1234567f;
        d = 9.1234567;
        double d2 = (double) f; //작은 타입 float -> 큰타입 double

        System.out.printf("f = %20.18f\n",f);    //f = 9.123456954956055000
        System.out.printf("d = %20.18f\n",d);    //d = 9.123456700000000000
        System.out.printf("d2 = %20.18f\n",d2);  //d2 = 9.123456954956055000

    }
}
