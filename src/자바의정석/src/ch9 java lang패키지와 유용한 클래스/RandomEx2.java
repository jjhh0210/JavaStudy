import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];    //0~9 까지의 갯수 담을것임

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] = rand.nextInt(10));
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            counter[number[i]]++;   //0~9까지의 갯수 담기
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 개수 :" + printGraph('#', counter[i]) + " " + counter[i]);
        }
    }

    public static String printGraph(char ch, int value) {
        StringBuffer sb = new StringBuffer(value);  //sb.capacity() = value
        for (int i = 0; i < sb.capacity(); i++) {   //sb.length()로 하면 안됨주의!!!!
            sb.append(ch);
        }
        return sb.toString();
    }
}
