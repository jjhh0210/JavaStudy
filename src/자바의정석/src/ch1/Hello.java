public class Hello {

    public static void main(String[] args) {
        int x=1, y=2;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x + ", y = "+ y);

    }
}
