class Tv {
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption; //캡션(자막) 상태(on/off) - default=false
    void displayCaption(String text) {
        if (caption) {
            //캡션이 true일 때만 text를 보여줌
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();    //조상클래스 Tv와 자손클래스 CaptionTv의 멤버가 합쳐진 인스턴스
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello world");
        ctv.caption = true; //자막을 킨다
        ctv.displayCaption("Hello world");

    }
}
