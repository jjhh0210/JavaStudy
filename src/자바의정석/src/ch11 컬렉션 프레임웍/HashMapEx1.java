import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("asdf123", "1111");
        map.put("qweqwe", "1111");
        map.put("asdf123", "1234"); ///1111 -> 1234로 값 변경
        System.out.println(map);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======로그인======");
            System.out.print("id: ");
            String id = sc.nextLine().trim();
            System.out.print("pw: ");
            String pw = sc.nextLine().trim();

            //1. 해당 아이디가 없는경우 - continue
            if (!map.containsKey(id)) {
                System.out.println("해당 아이디가 존재하지 않습니다. 다시 입력하세요.");
                continue;
            }
            //2. 해당아이디가 있는데 id, pw 일치하지 않는경우
            if(!map.get(id).equals(pw)){
                System.out.println("아이디와 비밀번호가 일치하지 않습니다. 다시 입력하세요.");
            }else {
                //3. 일치하는경우 - break
                System.out.println("로그인 되었습니다. "+id+"님 어서오세요.");
                break;
            }
        }
    }
}
