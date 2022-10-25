import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        //3 1 4 2 0 버블정렬
        int[] numArr = new int[5];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
        }
        boolean changed = false;
        System.out.println("numArr = "+Arrays.toString(numArr)+"-> 버블 정렬 시작!");

        for (int i = 0; i < numArr.length - 1; i++) {
            changed = false;
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if(numArr[j]>numArr[j+1]){
                    //swap
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;

                    changed = true; //자리바뀜 발생시 changed = true
                }
            }
            if(changed==false) break;   //중간에 한번이라도 자리바꿈이 없었다면 이미 정렬 완료된거임, for문 빠져나옴
            System.out.println("i = " + i);
            System.out.println(Arrays.toString(numArr));

        }

    }
}
