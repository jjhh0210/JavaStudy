import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

public class String_methods {
    public static void main(String[] args) {
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(cArr);    //s = "hello";
        char c = s.charAt(1);   //e

        System.out.println(s.compareTo("g"));   //1
        System.out.println(s.concat(" world")); //hello world -> s는 변화 x
        System.out.println(s.contains("w"));    //false
        System.out.println(s.endsWith("o"));    //true
        System.out.println("s.equals(\"hello\") = " + s.equals("hello"));   //true
        System.out.println("s.equalsIgnoreCase(\"Hello\") = " + s.equalsIgnoreCase("Hello"));   //true
        System.out.println("s.indexOf(\"l\") = " + s.indexOf('l')); //위치) 2
        System.out.println("s.lastIndexOf('l') = " + s.lastIndexOf('l'));   //3
        System.out.println("s.indexOf('l',3) = " + s.indexOf('l', 3));  //idx=3부터 확인, 3
        System.out.println("s.indexOf(\"lo\") = " + s.indexOf("lo"));   //3
        System.out.println("s.length() = " + s.length());
        System.out.println("s.replace('h','o') = " + s.replace('l', 'o'));  //heooo
        System.out.println("s.replace(\"he\",\"LL\") = " + s.replace("he", "LLL"));  //LLLllo

        String s2 = "dog,cat,bird,bear,rabbit";
        String[] animals = s2.split(",",4);
        System.out.println("animals = " + Arrays.toString(animals));    //그냥 animals하면 당연히.. 배열의 주소값
        for (int i = 0; i < animals.length; i++) {
            System.out.println("animals["+i+"] = " + animals[i]);
        }
        System.out.println("s2.toLowerCase() = " + s2.toUpperCase());
        System.out.println("s2.substring(4) = " + s2.substring(4));     //cat,bird,..,rabbit
        System.out.println("s2.substring(4,7) = " + s2.substring(4, 6));    //4~5(6포함 x),ca
        String s3 = "  hello   world      ";
        System.out.println("s3.trim() = " + s3.trim()); //hello   world(양쪽공백만 제거됨)
        System.out.println(String.valueOf(30f));    // = "30.0"
        System.out.println("String.valueOf(true) = " + String.valueOf(true));
        String s4 = String.valueOf(s2.charAt(3));   //문자 -> String
        System.out.println("s4 = " + s4);   //,
        System.out.println();
        //p.471~ join과 StringJoiner
        String s5 = "apple&bannana&pear";
        String arr[] = s5.split("&");
        String fruits = String.join(" - ", arr);
        System.out.println("fruits = " + fruits);   //fruits = apple - bannana - pear

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String fruit : arr) {
            sj.add(fruit.toUpperCase());
        }
        System.out.println("sj = " + sj);   //toString()붙이나 안붙이나 출력결과 똑같음
        System.out.println("sj.toString() = " + sj.toString());
    }
}
