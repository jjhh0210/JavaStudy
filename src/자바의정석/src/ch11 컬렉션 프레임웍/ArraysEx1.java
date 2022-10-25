import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.setAll(arr,i -> (int)(Math.random()*5)+1);   //난수 1~5
        System.out.println("arr = " + Arrays.toString(arr));

        for (int i : arr) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

    }
}