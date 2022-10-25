import java.util.Scanner;

public class PoketmonTest {
    public static void main(String[] args) {
        String name;
        String color;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 포켓몬 캐릭터를 입력하시겠습니까?");
        int n = sc.nextInt();
        Poketmon[] poketmons = new Poketmon[n];
        for (int i = 0; i < n; i++) {
            System.out.println("<포켓몬 스티커 정보"+(i+1)+">");
            System.out.println("이름:");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("색깔:");
            color = sc.nextLine();
            System.out.println("갯수:");
            num = sc.nextInt();
            poketmons[i] = new Poketmon(name, color, num);
        }
        //포켓몬 리스트 출력
        printAll(poketmons);
        System.out.println("총 스티커 갯수:"+addAll(poketmons));
    }

    static int addAll(Poketmon[] poketmons) {
        int result = 0;
        for (int i = 0; i < poketmons.length; i++) {
            result += poketmons[i].num;
        }
        return result;
    }

    static void printAll(Poketmon[] poketmons) {
        System.out.println("------My Poketmons List-------");
        for (int i = 0; i < poketmons.length; i++) {
            poketmons[i].print();
        }
    }
}

class Poketmon{
    //포켓몬 스티커~!
    String name;    //캐릭터 이름
    String color;   //캐릭터 색깔
    int num;    //스티커 수량

    Poketmon() {
        this("-", "-", 0);
    }

    Poketmon(String name, String color, int num) {
        this.name = name;
        this.color = color;
        this.num = num;
    }

    void print() {
        //인스턴스 메서드로 선언해야 인스턴스 변수 맘대로 사용 가능~
        System.out.println("- "+this.color+"색 "+this.name+" "+this.num+"개");
    }

}
