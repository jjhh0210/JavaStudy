public class OperatorEx5 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';  //공백으로 초기화

        int i = c1 + 1; //c1 값 97이 int로 형변환되어 계산, i=98


        c3 = (char) (c1 + 1);   //c3 = 'b'
        //c2 = c2+1 에러!! (연산 결과가 int이기 때문)
        c2++;   //  'b', 98
        c2++;   //  'c', 99

        System.out.println("i = " + i);     //i = 98
        System.out.println("c2 = " + c2);   //c2 = c
        System.out.println("c3 = " + c3);   //c3 = b
        
    }
}
