public class RepairableTest {
    public static void main(String[] args) {
        SCV scv = new SCV();
        scv.repair(new Tank());
        scv.repair(new Dropship());
//        scv.repair(new Marine()); //Marine은 Repairable 타입이 아니다!
    }
}
interface Repairable{}

class Unit {
    int hitPoint;   //현재 체력
    final int MAX_HP;   //max 체력

    Unit() {
        this(100);
    }
    Unit(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    AirUnit(int hp) {
        super(hp);
    }
}
class Marine extends GroundUnit{
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank(){
        super(150); //탱크의 MAX_HP는 150!
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}
class Dropship extends AirUnit implements Repairable {
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        //Repairable을 implements한 SCV, Tank, Dropship의 인스턴스만이 매개변수로 들어올 수 있다.
        if (r instanceof Unit) {
            //Repairable에 정의되어있는 멤버가 x ->Repairable타입의 참조변수 r로는 아무것도 할 수 없으므로
            //타입캐스팅 필수!!! 해당 인스턴스의 멤버 쓰려면!!
            Unit u = (Unit)r;
            while (u.hitPoint != u.MAX_HP) {
                //현재체력과 Max체력이 같아질 때까지 유닛의 HP증가시킨다.
                u.hitPoint++;
            }
            System.out.println(u+"의 수리가 끝났습니다. 현재체력 = "+u.hitPoint);

        }
    }
}