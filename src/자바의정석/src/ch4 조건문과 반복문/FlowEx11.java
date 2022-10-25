import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.(011231-1111222) >");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char genderNo = regNo.charAt(7);

        switch (genderNo) {
            case '1': case '3':
                if (genderNo == 1) {
                    System.out.println("당신은 2000년 이전에 출생한 남자 입니다");
                } else{
                    System.out.println("당신은 2000년 이후에 출생한 남자 입니다");  
                }
                break;
            case '2': case '4':
                if (genderNo == 2) {
                    System.out.println("당신은 2000년 이전에 출생한 여자입니다");
                }else{
                    System.out.println("당신은 2000년 이후에 출생한 여자입니다");
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록 번호입니다.");
        }

    }
}
