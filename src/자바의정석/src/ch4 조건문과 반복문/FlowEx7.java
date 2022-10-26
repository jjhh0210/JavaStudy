import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        int userInput, comInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1),바위(2), 보(3) 중 하나를 입력하세요.>");
        userInput = sc.nextInt();
        comInput = (int) (Math.random() * 3) + 1;   //1~3 사이의 랜덤 정수 반환, if 0~3 사이 랜덤정수 시 (int)(Math.random()*4)

        System.out.println("userInput = " + userInput);
        System.out.println("comInput = " + comInput);
        switch (userInput - comInput) {
            case 1: case -2:
                System.out.println("이겼습니다!");
                break;
            case 2: case -1:
                System.out.println("졌습니다!");
                break;
            case 0:
                System.out.println("비겼습니다");
                break;  //마지막은 break 필요 x
        }

    }
}
