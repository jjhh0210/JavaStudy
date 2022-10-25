public class ArrayEx17 {
    public static void main(String[] args) {
        //사칙연산 by 커맨드라인 입력
        
        //입력된 매개변수가 3개가 아니면 시스템종료
        if (args.length != 3) {
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]);   //string -> int
        char op = args[1].charAt(0);    //string -> ch
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("wrong op");
        }
        System.out.println("result: "+result);
    }
}
