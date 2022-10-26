import java.util.Stack;

/*웹브라우저의 뒤로가기+앞으로 가기*/
public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack fwd = new Stack();

    public static void main(String[] args) {
        goURL("google");
        goURL("yahoo");
        goURL("naver");
        goURL("daum");

        printStatus();
        goBack();
        printStatus();
        goBack();
        printStatus();
        goForward();
        printStatus();

        goURL("nate");
        System.out.println("=====새로운 주소로 이동 후====");
        printStatus();

        goBack();
        printStatus();
        
    }

    public static void printStatus() {
        System.out.println("back : " + back);
        System.out.println("fwd : " + fwd);
        System.out.println();

    }

    public static void goURL(String url) {
        //back에 push
        back.push(url);
        //fwd 비우기 (앞으로가기가 없어질테니)
        if (!fwd.empty()) {
            fwd.clear();
        }
    }

    public static void goForward() {
        System.out.println("=======앞으로 가기========");
        if (!fwd.empty()) {
            Object popped = fwd.pop();
            back.push(popped);
        }
        System.out.println("현재 주소: "+back.peek());
    }

    public static void goBack() {
        System.out.println("=======뒤로 가기=======");
        if (!back.empty()) {
            Object popped = back.pop();
            fwd.push(popped);
        }
        System.out.println("현재 주소: "+back.peek());
    }
}
