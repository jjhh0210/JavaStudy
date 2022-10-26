import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/*사용자가 입력한 명령어의 이력 보이기*/
public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        try {
            while (true) {
                System.out.print(">>");
                String input = sc.nextLine();
                if (input.equals("")) {
                    //입력이 공백이라면
                    continue;
                }
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("exit");
                    break;
                } else if (input.equalsIgnoreCase("help")) {
                    save(input);
                    showHelp();
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);
                    showHistory2();
                } else {
                    save(input);
                    System.out.println(input);
                }
            }
        } catch (Exception e) {
            System.out.println("입력 오류입니다.");
        }
    }

    private static void showHistory() {
        //my version
        LinkedList tmp = (LinkedList) q;
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println((i + 1) + "." + tmp.get(i));
        }
        System.out.println("tmp = " + tmp);
    }

    private static void showHistory2() {
        //book version
        int i=0;
        LinkedList tmp = (LinkedList) q;
        ListIterator it = tmp.listIterator();
        while (it.hasNext()) {
            System.out.println(++i + "." + it.next());
        }
    }

    private static void showHelp() {
        System.out.println("help - 도움말을 보여줍니다");
        System.out.println("q 또는 Q - 프로그램 종료");
        System.out.println("history - 최근에 입력한 명령어 "+MAX_SIZE+"개를 보여줍니다.");
    }

    private static void save(String input) {
        q.offer(input);
        if (q.size() > MAX_SIZE) {
            //넘치면 하나 삭제
            q.poll();
        }

    }
}


