public class CastingEx1 {
    public static void main(String[] args) {
        double d = 83.2;
        int i = (int) d;    //float -> int
        char ch = (char)65; //int -> char
        float f = (float) 12; //int -> float
        System.out.println("i = " + i +" d = "+d);  //i = 83 d = 83.2
        System.out.println("ch= " + ch);    //ch = A
        System.out.println("f = " + f); //f = 12.0
    }
}
