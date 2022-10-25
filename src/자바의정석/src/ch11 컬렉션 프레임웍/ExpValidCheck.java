import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/*수식의 괄호가 올바른지 체크*/
public class ExpValidCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();  //수식 입력
        System.out.println("입력받은 수식: "+expression);
        Stack st = new Stack();
        char c;
        try {
            for (int i = 0; i < expression.length(); i++) {
                c = expression.charAt(i);
                if (c == '(') {
                    st.push(c);
                } else if (c == ')') {
                    st.pop();
                }
            }
            //검사 끝났는데 stack이 비워져있지 않으면 오류 
            if (!st.empty()) {
                System.out.println("괄호가 일치하지 않습니다");
            }else{
                System.out.println("괄호가 일치합니다.");
            }

        } catch (EmptyStackException e) {
            //pop해야 하는데 스택이 비어있으면 오류
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
