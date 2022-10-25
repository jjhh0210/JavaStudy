import java.util.*;

public class OperatorEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("대문자로 변환 할 문자를 입력해주세요");
        String input = sc.nextLine();
        char lowerCase = input.charAt(0);
        char UpperCase = (char) (lowerCase - 32);

        System.out.println("UpperCase = " + UpperCase);


    }
}
