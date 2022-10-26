import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        //배열 shuffle
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));
        int tmp;
        int j = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("<"+(i+1)+"번째>");
            System.out.println("변경 전: "+Arrays.toString(numArr));

            j = (int)(Math.random() * numArr.length);
            tmp = numArr[j];
            numArr[j] = numArr[0];
            numArr[0] = tmp;
            System.out.println("변경 후: "+Arrays.toString(numArr));

        }

    }
}
