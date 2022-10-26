public class VarArgsEx {
    public static void main(String[] args) {
        //String concat 예제
        String[] arr = {"Jihyun", "Minjeong", "Haerim", "Nayoung"};
        System.out.println(concat(" ", "ABC", "abc", "xyz"));
        System.out.println(concat("-", arr));
        System.out.println(concat(",", new String[]{"1", "2", "3"}));
//        System.out.println(concat(",", {"1", "2", "3"})); //new String[] 없이 그냥 {}만 넘기면 x
        System.out.println("[" + concat(",", new String[0]) + "]");
        System.out.println("[" + concat(",") + "]");    //인자 없기 가능

        //int add 예제
        System.out.println(add(1, 2, 3));   //6
        System.out.println(add(3)); //3
        System.out.println(add());  //인자 없기 가능 : 0
        System.out.println(add(new int[]{10, 20, 30})); //60
//        System.out.println(add({1, 2, 3}));   //new int[] 없이 그냥 배열 넘기면 x

    }

    static String concat(String delim, String... args) {
        String result = "";
        for (String s : args) {
            result += s + delim;
        }
        return result;
    }

    static int add(int... args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result;
    }

}
