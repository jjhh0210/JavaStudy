import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] argArr = null; //참조형 변수의 기본값은 null임

        while (true) {
            System.out.print(">>");

            String input = sc.nextLine().trim();
            if (input.equals("")) {
                continue;
            } else if (input.equals("q")) {
                break;
            }
            argArr = input.split(" +"); //공백이 적어도 한개 이상
            for (String s : argArr) {
                System.out.println(s);
            }
        }

    }
}
