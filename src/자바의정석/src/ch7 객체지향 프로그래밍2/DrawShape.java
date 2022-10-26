public class DrawShape {
    public static void main(String[] args) {
        Point[] points = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(points);
        Circle c = new Circle(50, new Point(150,150),"red");

        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "black";

    void draw() {
        System.out.printf("[color = %s]\n", color);
    }

}

class Point {
    int x,y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}

class Circle extends Shape{
    int r; //반지름
    Point center;   //원점 좌표(점 1개)

    Circle() {
        this(100, new Point(0, 0),"blue"); //다른 생성자(this로) 호출할 땐 맨 앞줄에 있어야!
    }

    Circle(String color) {
        this(100, new Point(0, 0), color);
    }

    Circle(int r, Point center,String color) {
        this.center = center;
        this.r = r;
        this.color = color;
    }

    void draw() {
        //오버라이딩!
        System.out.printf("[center = (%d,%d), r = %d, color = %s]\n",center.x,center.y,r,color);
        //여기서 왜 this.center.x를 안쓰냐면, this는 위 생성자 경우처럼 인스턴스변수와 지역변수 헷갈리지 않게끔 하는거
    }

}

class Triangle extends Shape{
    Point[] points = new Point[3];  //객체 배열(점 3개)

    {
        //인스턴스 변수 초기화 블럭
        points[0] = new Point(0,0);
        points[1] = new Point(1, 0);
        points[2] = new Point(0, 1);
    }
    Triangle() {
        //this(points); 안됨
    }

    Triangle(Point[] points) {
        this.points = points;
    }

    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n",points[0].getXY(),points[1].getXY(),points[2].getXY(),color);
    }


}
