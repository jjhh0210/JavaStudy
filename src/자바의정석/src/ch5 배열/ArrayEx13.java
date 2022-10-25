import java.util.Arrays;

public class ArrayEx13 {
    public static void main(String[] args) {
        //16진수->2진수 변환
        char[] hex = {'C', 'A', 'F', 'E'};
//        String[] bin = new String[16];
//        for (int i = 0; i < bin.length; i++) {
//            bin[i] = Integer.toBinaryString(i); //이렇게 하면 앞에 0들이 생략됨..
//        }
//        System.out.println(Arrays.toString(bin));
        String[] bin = {"0000","0001","0010","0011"
                , "0100", "0101","0110","0111"
                ,"1000","1001","1010","1011"
                , "1100","1101","1110","1111"};
        String result = "";
        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                //hex값이 0~9일 때
                result += bin[hex[i] - '0']; //'8'-'0' = 8 ->bin[8] = 1000
            }else{
                //hex값이 A~F
                result += bin[hex[i] - 'A' + 10]; //'C'-'A' = 2, +10 -> C는 12 -> bin[12] = 1100
            }
        }
//        System.out.println("hex: " + hex);    //원래 char배열 sout(hex)하면 CAFE인데 sout("~"+hex) 하면 참조값 출력됨...
        System.out.println("hex: " + new String(hex));  //다른 문자열과 합쳐서 char배열을 문자열로 출력하려면 이렇게!
        System.out.println("binary result: " + result);

    }
}
