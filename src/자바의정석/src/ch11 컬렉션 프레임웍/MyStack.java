import java.util.EmptyStackException;
import java.util.Vector;

/*Vector 상속받아 Stack 직접 구현해보기*/
public class MyStack extends Vector {

    //push
    public Object push(Object item) {
        add(item);
        return item;
    }

    //pop
    public Object pop() {
        Object removed = peek();
        removeElementAt(size() - 1);
        return removed;

    }

    //peek
    public Object peek() {
        if (empty()) {
            throw new EmptyStackException();    //RuntimeException이므로 예외처리 따로 필요 x
        }
        Object last = get(size() - 1);
        return last;

    }

    //empty
    public boolean empty() {
        return size() == 0;
    }

    //search
    public int search(Object item) {
        int idx = lastIndexOf(item);    //끝에서부터 객체를 찾는다
        if (idx == -1) {
            //객체 찾지 못한 경우 return -1
            return -1;
        }else{
            //찾은 경우 : stack은 맨 위 부터 1이므로, size - i
            return size() - idx;
        }

    }

}

class MyStackEx {
    public static void main(String[] args) {
        MyStack st = new MyStack();

        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.peek());  //c
        st.pop();   //c out
        System.out.println(st.search("a")); //2
        System.out.println(st); //[a,b]

    }

}
