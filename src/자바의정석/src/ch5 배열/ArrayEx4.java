public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C','D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        //char배열은 배열명 출력시 순서대로 문자열로 출력됨
        System.out.println(abc);
        System.out.println(num);

        //배열 abc와  num을 붙여서 하나의 배열로 만들자
        char[] abcnum = new char[abc.length + num.length];
        System.arraycopy(abc, 0, abcnum, 0, abc.length);
        System.arraycopy(num, 0, abcnum, abc.length, num.length);
        System.out.println(abcnum); //ABCD0123456789

        //배열 abc를 num의 첫번째 위치부터 배열 abc길이만큼 복사 즉, A B C D 4 5 6 7 8 9
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);    //ABCD456789
        //num의 인덱스6 위치에 abc배열 3개를 복사 즉, A B C D 4 5 A B C 9
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);    //ABCD45ABC9
    }
}
