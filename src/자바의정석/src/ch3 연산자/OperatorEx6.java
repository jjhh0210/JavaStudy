public class OperatorEx6 {
    public static void main(String[] args) {
        char c1 = 'a';
//        char c2 = c1+1;  에러남
        char c2 = 'a' + 1;  //에러 x
        System.out.println("c2 = " + c2); //c2 = b
    }
}
