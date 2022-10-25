import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args) {
        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) {
            number[i] = new Random().nextInt(10); //0~9 사이의 정수
            //number[i] = (int)(Math.random()*10);
            System.out.print(number[i]);
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i+"의 개수 :");
            printGraph(number, i);
        }

    }

    public static void printGraph(int[] number, int num) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) {
                count++;
                System.out.print("#");
            }
        }
        System.out.println("  " + count);
    }
}





