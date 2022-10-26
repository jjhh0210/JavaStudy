import java.util.*;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 입력해주세요.");
//        String s = scanner.nextLine();
//        int n = Integer.parseInt(s);

        int n = scanner.nextInt();
        System.out.printf("정수: %d",n);

    }

}
