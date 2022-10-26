public class CastingEx2 {

    public static void main(String[] args) {
        int i =10;
        byte b = (byte)i;
        System.out.printf("int i = %d -> byte b = %d\n",i,b);   //10 -> 10

        i = 300;
        b = (byte) i;
        System.out.printf("int i = %d -> byte b = %d\n",i,b);   //300 -> 44

        b = 10;
        i = (int) b;
        System.out.printf("byte b = %d -> int = %d\n",b,i); //10 -> 10

        b = -2;
        i = (int) b;
        System.out.printf("byte b = %d -> int = %d\n",b,i); //-2 -> -2

        System.out.println("i = "+ Integer.toBinaryString(i)); //i = 11111111111111111111111111111110 (int타입 -2의 이진표현)
    }

}
