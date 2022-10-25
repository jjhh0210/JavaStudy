public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Lee"};
        //배열 요소 출력 1
        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }
        //names의 첫번째 요소를 "yu"로 변경
        names[0] = "Yu";

        //배열 요소 출력 2
        for (String name : names) {
            System.out.print(name+",");
        }
    }
}
