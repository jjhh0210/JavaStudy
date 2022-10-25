public class FloatEx {
    public static void main(String[] args) {
        double d = 2.123123123123123d;  //d 생략 가능
        float f = 2.123123123123123f;   //f 생략 불가
        System.out.println("d = " + d); //d = 2.123123123123123  소수점 15째자리까지만
        System.out.println("f = " + f); //f = 2.1231232  소수점 7째자리까지만
        System.out.printf("d = %f\n",d);    //printf의 %f는 기본적으로 소수점 6째자리까지만 출력
        System.out.printf("d = %20.10f\n",d);   //20자리 중 10자리는 소수점이하 출력 d =         2.1231231231
        System.out.printf("f = %20.10f",f);     //float이므로 소수점 7번째 자리 부턴 저장공간의 한계로 오차 발생(보통 6번째까진 동일)

    }
}
