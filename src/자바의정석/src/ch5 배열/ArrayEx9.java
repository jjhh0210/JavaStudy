import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        //임의의 값으로 arr 배열 채우기
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * code.length); //0~4 임의의 위치 선택
            arr[i] = code[n]; //선택 된 code[n]임의의 값을 차례대로 arr에 넣음
        }
        System.out.println(Arrays.toString(arr));

    }
}
