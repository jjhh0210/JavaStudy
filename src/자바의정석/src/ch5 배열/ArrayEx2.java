import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};

        //iArr1 = 1,2,3,..., 10 배열
        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        //iArr2 = 1~10중 랜덤 수 배열
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1; //1~10 난수
        }

        //iArr1 배열 출력
        for (int i = 0; i<iArr1.length; i++) {
            System.out.print(iArr1[i]+",");
        }

        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr)); //[a,b,c,d]
        System.out.println(iArr3);  //[I@6aaa5eb0 <- 타입@배열의 주소(실제 주소는 x, 내부주소)
        System.out.println(chArr);  //abcd
    }
}
