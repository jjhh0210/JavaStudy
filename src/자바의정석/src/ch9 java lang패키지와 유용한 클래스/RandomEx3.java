import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomEx3 {
    public static void main(String[] args) {
        System.out.println("난수 발생 범위 지정해주세요");
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();

        
//        for (int i = 0; i < 10; i++) {
//            System.out.print(getRand(from,to)+", ");
//        }
//        System.out.println();
        int[] result = fillRand(new int[10], from, to);
        int[] result2 = fillRand(new int[10], new int[]{2, 3, 5, 7});    //그냥 {2,3,5,7}만 하면 x
        System.out.println("fillRand result = " + Arrays.toString(result));
        System.out.println("fillRand result2 = " + Arrays.toString(result2));

    }

    public static int getRand(int from, int to) {
        //from ~ to까범위의 정수값 반환 ex)10,5  -> 5,6,7,8,9,10 중의 랜덤숫자
        return (int) (Math.random() * (Math.abs(from - to)+1)) + Math.min(from, to);
    }

    public static int[] fillRand(int[] arr, int[] data) {
        //arr에 배열 data에 있는 값들로 채워서 반환
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRand(0,data.length-1)];    //인덱스(요소) 랜덤픽
        }
        return arr;
    }

    public static int[] fillRand(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }
        return arr;
    }
}
