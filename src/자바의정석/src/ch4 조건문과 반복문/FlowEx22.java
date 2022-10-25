public class FlowEx22 {
    public static void main(String[] args) {
        //향상 for문 예제 (배열의 모든요소의 합 구하기)
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;


        for (int tmp : arr) {
            System.out.print(tmp+" ");
            sum +=tmp;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
