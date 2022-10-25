public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[5];
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;  //10,11,12,13,14
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();       //11,12,13,14,15
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
        }
        
    }
}
