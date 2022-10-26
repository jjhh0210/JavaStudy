import java.util.Scanner;

public class FlowEx22_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("학생 수를 입력 해주세요:");
        int n = sc.nextInt();
        String[] students = new String[n];

        System.out.println("학생 이름을 입력해주세요");
        for (int i = 0; i < n; i++) {
            students[i] = sc.next();
        }

        System.out.print("학생목록: ");
        for (String stu : students) {
            System.out.print(stu+" ");
        }

    }
}
