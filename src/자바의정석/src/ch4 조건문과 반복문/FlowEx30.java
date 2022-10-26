public class FlowEx30 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (true) {
            if (sum > 100) {
                break;  //break할 조건을 맨 위에 두면 좋음(?)
            }
            sum += ++i;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
