public class ArrayEx3 {
    public static void main(String[] args) {
        //arr의 두배의 배열 !
        int[] arr = {1, 2, 3, 4, 5};
        int[] tmp = new int[arr.length*2];

        System.out.println("[변경 전]");
        System.out.println("arr.length = "+arr.length);
        for(int arrs : arr){
            System.out.println(arrs);
        }
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;

        System.out.println("[변경 전]");
        System.out.println("arr.length = "+arr.length);
        for(int arrs : arr){
            System.out.println(arrs);
        }

    }
}
