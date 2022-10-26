public class ReferenceParamEx3 {

    public static void main(String[] args) {
        final int SIZE = 6;
        int[] arr = new int[SIZE];
        makeArr(arr);   //배열 원소 생성
        printArr(arr);  //배열 출력
        sortUpArr(arr);   //오름차순 정렬
        System.out.println("after Up sort!");
        printArr(arr);  //배열 출력
        sortDownArr(arr); //내림차순 정렬
        System.out.println("after Down sort!");
        printArr(arr);  //배열 출력
        System.out.println("sum = "+sumArr(arr));   //총합 출력
    }

    static void makeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10)+1; //1~10까지의 난수 저장
        }
    }

    static void printArr(int[] arr) {
        System.out.print("배열 arr: [");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortUpArr(int[] arr) {
        //오름차순 버블정렬
        boolean changed = false;
        for (int i = 0; i < arr.length - 1; i++) {
            changed = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    changed = true;
                }
            }
            if (changed == false) {
                break;
            }
        }

    }

    static void sortDownArr(int[] arr) {
        boolean changed = false;
        for (int i = 0; i < arr.length - 1; i++) {
            changed = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    changed = true;
                }
            }
            if (changed == false) {
                break;
            }
        }
    }
}
