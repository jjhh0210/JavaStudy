public class FlowEx26 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while ((sum += ++i) <= 100) {
            System.out.println(i + " - " + sum);
        }
    }
}
