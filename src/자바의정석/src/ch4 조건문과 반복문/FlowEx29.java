public class FlowEx29 {
    public static void main(String[] args) {
        //369게임!
        int tmp;
        for (int i = 1; i <= 100; i++) {
            tmp = i;
            System.out.printf("i = %d ",i);
            while (tmp != 0) {
                if ((tmp % 10) % 3 == 0&&(tmp%10)!=0) {
                    System.out.print("짝");
                }
                tmp /= 10;
            }
            System.out.println();
        }
    }
}

