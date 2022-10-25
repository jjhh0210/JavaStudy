public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);  //본인의 주소를 반환하기 때문에, sb,sb2,sb3는 같은 인스턴스를 공유한다!!!!
        sb.append('4').append("56");
        StringBuffer sb3 = sb.append(78);
        sb3.replace(0, 4, "ABCDE"); //ABCDE45678
        sb3.reverse();  //87654EDCBA
        sb3.setCharAt(2, '-');  //87-54EDCBA

        //all the same
        System.out.println("sb = " + sb);   //87-54EDCBA
        System.out.println("sb2 = " + sb2); //87-54EDCBA
        System.out.println("sb3 = " + sb3); //87-54EDCBA
        System.out.println("sb.insert(1,\"abc\") = " + sb.insert(1, "abc"));
        System.out.println("sb.deleteCharAt(2) = " + sb.deleteCharAt(2));

        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

    }
}
