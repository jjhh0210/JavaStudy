import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        //빈도수 구하기
        int[] numArr = new int[5];
        int[] counter = new int[10];    //0~9까지의 빈도수를 담을 배열 즉, counter[3] = 7 -> 3이 7개 있음
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;   //if i=2, numArr[2] = 4, counter[4]가 하나 증가함
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println(i+"의 개수: "+counter[i]);
        }

    }
}
