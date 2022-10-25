public class PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.x);   //100
        System.out.println("p3.y = " + p3.y);   //200
        System.out.println("p3.z = " + p3.z);   //300
    }
}

class Point2D {
    int x = 10;
    int y = 20;

    Point2D(int x, int y) {
        //Point2D는 아무것도 상속 안받음 ->super()로 Object() 자동 호출
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point2D{
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }
    Point3D(int x, int y, int z) {
        super(x, y);    //Point2D(int x,int y) 호출
        this.z = z;
    }
}

