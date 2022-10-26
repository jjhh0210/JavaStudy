public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            int n = (int) (Math.random() * ball.length); //배열의 임의의 인덱스 선정
            System.out.println((i+1)+"번째 번호: "+ball[n]);
            int tmp = ball[i];
            ball[i] = ball[n];
            ball[n] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d\n",i,ball[i]);

        }
    }
}
