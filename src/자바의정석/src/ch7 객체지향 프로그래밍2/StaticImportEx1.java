import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        //클래스에 alt+enter로 static import 간편하게 가능
        //System.out.println(Math.random());
        out.println((int)(random()*3)+1);
        //System.out.println("Math.PI = "+Math.PI);
        out.println("Math.PI = " + PI);
    }
}
