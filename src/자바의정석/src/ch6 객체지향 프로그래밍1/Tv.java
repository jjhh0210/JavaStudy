public class Tv {
    //속성(멤버변수)
    Boolean power; //전원 상태
    int width;//크기
    int height;//높이
    String color;//색깔
    int volume;//볼륨
    int channel;//(현재)채널

    //기능(메서드)
    void power(){power = !power;} //전원 끄고 켜기
    void volumeUp(){volume +=10;} //볼륨 높이기
    void volumeDown(){volume -=10;}//볼륨 줄이기
    void channelUp(){++channel;}//채널 위로
    void channelDown(){--channel;}//채널 아래로
}
