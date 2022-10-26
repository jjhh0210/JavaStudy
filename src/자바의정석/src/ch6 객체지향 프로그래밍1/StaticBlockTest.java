public class StaticBlockTest {
    static int[] arr = new int[10];

    //클래스변수 초기화 블럭
    static{
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;    //1~10 사이 임의의 값을 원소로 저장
        }
    }

    //메인 함수, 배열 출력
    public static void main(String[] args) {
        //배열 출력 1
        int i = 0;
        for (int elem : arr) {
            System.out.println("arr["+(i++)+"] : "+elem);
        }
        //배열 출력 2
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("arr[%d] : %d\n", i, arr[i]);
//        }
    }
}
