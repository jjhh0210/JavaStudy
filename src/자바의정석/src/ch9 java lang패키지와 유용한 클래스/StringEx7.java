import java.util.Scanner;

public class StringEx7 {
    public static void main(String[] args) {
        System.out.println("전체 파일 디렉토리를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String directory = sc.nextLine();
        //1) 마지막 백슬래쉬의 위치를 뒤에서 부터 찾는다
        int idxOfSlash = directory.lastIndexOf('\\');
        System.out.println("idxOfSlash = " + idxOfSlash);
        //2) idxOfSlash위치부터 '.'의 위치를 찾는다.
        int idxOfDot = directory.indexOf('.', idxOfSlash);   //매개변수 순서 주의! ch가 먼저
        System.out.println("idxOfDot = " + idxOfDot);
        //3) 확장자 포함 전체 파일명 추출
        String fileName = directory.substring(idxOfSlash+1);
        //4) 확장자를 제외한 파일명 추출
        String fileName2 = directory.substring(idxOfSlash + 1, idxOfDot);

        System.out.println("경로: "+directory);
        System.out.println("확장자 포함 파일명: " + fileName);
        System.out.println("확장자 제외 파일명: " + fileName2);
        
    }
}
