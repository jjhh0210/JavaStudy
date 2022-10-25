public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car(); //white, auto, 4
        Car c2 = new Car(c1);   //c1의 복사본을 c2에 생성(white, auto, 4)
        System.out.println("c1 color,gearType,door: " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2 color,gearType,door: " + c2.color + ", " + c2.gearType + ", " + c2.door);
        //c1의 인스턴스 변수 값 변경 (red, auto, 10)
        c1.color = "red";
        c1.door = 10;
        System.out.println("c1 변경 후 ");
        System.out.println("c1 color,gearType,door: " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2 color,gearType,door: " + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}
