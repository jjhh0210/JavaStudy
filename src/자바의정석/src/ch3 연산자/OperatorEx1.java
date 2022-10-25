public class OperatorEx1 {
    public static void main(String[] args) {
      int i = 5, j = 0;
      j = i++;  //j = 5 대입 후 i 증가
        System.out.println("j = " + j + ", i = " + i);

        i = 5;
        j = ++i;    //i 증가 후 j = 6 대입
        System.out.println("j = " + j + ", i = " + i);
        
    }
}
