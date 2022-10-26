import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int i = Integer.parseInt(input, 2); //2진수 input을 10진수로
        System.out.println(input + " = " + i);
    }
}
