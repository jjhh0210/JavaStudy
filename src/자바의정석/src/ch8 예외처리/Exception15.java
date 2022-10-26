import java.io.File;
import java.util.Scanner;

public class Exception15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명을 입력하세요");
        String fileName = sc.nextLine();
        File f = createFile(fileName);
        System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        //파일 이름 적절성 검사
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유효하지 x");
            }
        } catch (Exception e) {
            //파일 이름이 유효하지 않은 예외를 받음 -> 제목없음.txt로 설정
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            try {
                //file클래스의 createNewFile() 메서드는 throws IOException -> 호출한 메서드에서 예외처리 필수
                f.createNewFile();
            } catch (Exception e) {
                System.out.println("예외 발생 : "+e.getMessage());
            }
            return f;
        }

    }

}
