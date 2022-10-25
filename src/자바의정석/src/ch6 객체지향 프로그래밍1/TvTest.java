public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv(); //Tv인스턴스 가리키는 참조변수 t선언, Tv 인스턴스 생성 -> 속성들은 기본값으로 초기화됨
        t.channel = 7;
        t.volume = 30;
        t.color = "Black";
        t.power = true;

        t.channelUp();
        t.volumeUp();
        System.out.println("현재 채널은 "+t.channel+"이고, 현재 볼륨은 "+t.volume+"입니다.");

    }
}
