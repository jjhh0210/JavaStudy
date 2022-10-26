import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        //메뉴 고르기 예제
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        outer:
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
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }
            //메뉴 1~3 중 제대로 고른 경우
            while (true) {
                System.out.println("계산할 값을 입력하세요. (계산 종료:0 , 전체 종료: 99) >");
                num = sc.nextInt(); //계산할 값

                if (num == 0) {
                    break;
                } else if (num == 99) {
                    System.out.println("프로그램을 종료합니다.");
                    break outer;
                }
                //계산 계속 할 경우,
                switch (menu) {
                    case 1:
                         //square
                        System.out.println("result = " + (int)Math.pow(num,2));
                        break;
                    case 2:
                        //square root
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        //log
                        System.out.println("result = " + Math.log(num));
                }
            }
        }
    }
}
