public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car("red", "manual", 2);
        System.out.println("c1 color,gearType,door: "+c1.color+", "+c1.gearType+", "+c1.door);
        System.out.println("c2 color,gearType,door: "+c2.color+", "+c2.gearType+", "+c2.door);
        System.out.println("c3 color,gearType,door: "+c3.color+", "+c3.gearType+", "+c3.door);
    }

}

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
        this("white","auto",4); //default
    }

    public Car(String color) {
        this(color, "auto", 4); //여기서 color는 지역변수
    }

    public Car(Car c) { //인스턴스 복사를 위한 생성자
        this(c.color, c.gearType, c.door);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
