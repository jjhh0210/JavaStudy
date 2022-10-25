import java.io.File;
import java.util.Scanner;

public class Exception16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명을 입력하세요");
        String fileName = sc.nextLine();
        try {
            File f = createFile(fileName);
            System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다");
        } catch (Exception e) {
            System.out.println("파일 이름이 유효하지 않습니다. 다시 입력해주세요");
        }
        //예외발생 가능1, 2 따로 처리하는거 코드 해보기
    }

    static File createFile(String fileName) throws Exception {
        if (fileName.equals("") || fileName == null) {
            throw new Exception();  //예외 발생 가능 1
        }
        File f = new File(fileName);
        f.createNewFile();          //예외 발생 가능 2
        return f;
    }
}
