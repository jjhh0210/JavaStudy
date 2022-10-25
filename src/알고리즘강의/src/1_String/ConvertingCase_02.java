import java.util.Scanner;

public class ConvertingCase_02 {
    public static String solution(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i]))
                arr[i] = Character.toLowerCase(arr[i]);
            else
                arr[i] = Character.toUpperCase(arr[i]);
        }
        return new String(arr);
//        String answer = "";
//        for(char x : s.toCharArray()){
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer +=Character.toLowerCase(x);
//        }
//        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
