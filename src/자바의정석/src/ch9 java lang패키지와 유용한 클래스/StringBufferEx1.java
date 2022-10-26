public class StringBufferEx1 {
    public static void main(String[] args) {
//        StringBuffer sb = "abc";  //(x)
//        StringBuffer sb = new StringBuffer("abc");    //(o)
        StringBuffer sb = new StringBuffer(10);
        sb.append("abc");   //sb = "abc"; (x)
        System.out.println("sb = " + sb);

        String s = sb.toString();   //String s = sb; (x)
        System.out.println("s = " + s);
        System.out.println("s.equals(\"abc\") = " + s.equals("abc"));

    }
}
