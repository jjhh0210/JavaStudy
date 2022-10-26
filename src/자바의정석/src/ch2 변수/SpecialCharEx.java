public class SpecialCharEx {
    public static void main(String[] args) {
        char ch = 'A';
        char ch2 = 65;  //ch2 = 'A'
        char ch3 = '가';
        char ch4 = 'a';
        System.out.printf("%c = %d(%#x)\n", ch, (int) ch, (int)ch); //A = 65(0x41)
        System.out.println("ch2 = " + ch2); //ch2 = A
        System.out.printf("%#x\n",(int)ch3);    //0xac00
        System.out.printf("%d, %#x\n",(int)ch4, (int)ch4);  //97, 0x61

        System.out.println("\"저장장소\"\t c:\\");  //"저장장소"	 c:\

    }
}
