import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception10 {
    public static void main(String[] args) {
        try{
            String fileName = "myfile.txt";
            FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 예외d 발생
        }
        catch (FileNotFoundException fe){
//            System.out.println("no file like"+fileName); //try 내의 변수를 사용할 수 없다..!
            System.out.println("파일 찾을 수 없음!! 예외메시지: "+fe.getMessage());
        }


    }
}
