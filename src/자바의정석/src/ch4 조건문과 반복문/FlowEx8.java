import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.(011231-1111222) >");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        int genderNo = regNo.charAt(7) - '0';     //문자열 중 8번째 문자가 성별을 명시하는 번호!

        switch (genderNo) {
            case 1: case 3:
                System.out.println("당신은 남자입니다");
                break;
            case 2: case 4:
                System.out.println("당신은 여자입니다");
                break;
            default:
                System.out.println("유효하지 않은 번호입니다");
        }

    }
}
