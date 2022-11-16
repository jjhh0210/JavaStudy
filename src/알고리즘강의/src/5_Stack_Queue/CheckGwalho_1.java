import java.util.Scanner;
import java.util.Stack;

public class CheckGwalho_1 {
    public static String solution(String str){
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        // (가 더 많다 : 마지막에 stack이 비어있지 않다
        // )가 더 많다 : stack에 pop할 것이 없다
        //올바른 괄호다 : 마지막에 stack이 비어있다 
        for (char x : str.toCharArray()) {
            if(x=='('){
                st.push(x);
            }
            else if(x==')'){
                if(st.empty())
                    return "NO";
                st.pop();
            }
        }
        if(!st.empty()) return "NO";

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }
}
