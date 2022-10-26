public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(add(3, 3));
        System.out.println(add(3L, 3));
        System.out.println(add(3, 3L));
        System.out.println(add(3L, 3L));
        int[] a = {100, 200, 300};
        System.out.println(add(a));
    }
    static int add(int a, int b) {
        System.out.print("int add(int a, int b): ");
        return a + b;
    }

    static long add(int a, long b) {
        System.out.print("long add(int a, long b): ");
        return a+b;
    }

    static long add(long a, int b) {
        System.out.print("long add(long a, int b): ");
        return a+b;
    }

    static long add(long a, long b) {
        System.out.print("long add(long a, long b): ");
        return a+b;
    }

    static int add(int[] a) {
        System.out.print("int add(int []): ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;

    }

}
