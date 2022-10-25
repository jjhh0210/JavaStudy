import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        System.out.println("<StringTokenizerEx1>");
        String src = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(src, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("\n<StringTokenizerEx2>");
        String src2 = "x= 100 * (200+300)/2";
        StringTokenizer st2 = new StringTokenizer(src2, "+-*/=() ");    //각각의 문자가 모두 구분자임!!!!!
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        //이거는 토크나이저 두개로 두번 나눌 수도 있는데 그냥 다르게 해봄
        System.out.println("\n<StringTokenizerEx3>");
        String src3 = "1,김천재,100,100,100|2,박수재,98,60,87";
        StringTokenizer st3 = new StringTokenizer(src3, ",|",true); //true시, 구분자도 token
        while (st3.hasMoreTokens()) {
            String token = st3.nextToken();
            if (token.equals(",")) {
                continue;
            } else if (token.equals("|")) {
                System.out.println("-------");
                continue;
            }
            System.out.println(token);

        }
    }
}
