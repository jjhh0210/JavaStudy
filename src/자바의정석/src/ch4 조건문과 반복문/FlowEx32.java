import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        //메뉴 고르기 예제
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0) >");
            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu<1 || menu > 3) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");

        }
    }
}
