public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;   //8자리 10진수
        float f = (float) i;
        double d = (double) i;

        System.out.printf("f =  %f\n",f); //f = 91234568.0000000, float는 10진수 7자리 정도만 정밀도 제공하므로, 8자리 이상의 수는 오차 발생가능
        System.out.printf("d =  %f\n",d); //d =  91234567.000000


        f = 1.6666f;
        i = (int) f;
        System.out.println("i = " + i);



    }
}
