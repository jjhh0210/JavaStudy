public class OperatorEx2 {
    public static void main(String[] args) {
        int a = 10, b = 4;
        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d / %d = %f\n",a,b,a/(float)b); //10/4 = 2.500000
        System.out.printf("%d / %d = %f",a,b,(float)(a/b)); //10/4 = 2.000000
    }
}
