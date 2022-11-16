import java.util.Scanner;
import java.util.Stack;

public class Postfix_4 {
    public static int solution(String str){
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (char x : str.toCharArray()) {
            //숫자는 push
            if (Character.isDigit(x)) {
                st.push(x - '0');
            }
            //연산자면
            else{
                int num2 = st.pop();    //연산자 뒤 숫자
                int num1 = st.pop();    //연산자 앞 숫자
                if(x=='+') st.push(num1+num2);
                else if(x=='-') st.push(num1-num2);
                else if(x=='*') st.push(num1*num2);
                else if(x=='/') st.push(num1/num2);
            }
        }
        answer = st.get(0); //st.peek();
        return answer;

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));

    }
}
