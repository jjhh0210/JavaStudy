public class FlowEx14 {
    public static void main(String[] args) {
        System.out.println("변수 두개로 출력");
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.printf("%2d \t %2d\n",i,j);
        }
        System.out.println("변수 한개로 출력");
        for (int k = 1; k <= 10; k++) {
            System.out.printf("%2d \t %2d\n",k,11-k);
        }
    }
}
