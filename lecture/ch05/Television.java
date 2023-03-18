package lecture.ch05;

public class Television { 
  // 필드정의 객체의 속성을 나타냄
  int channel; // 채널번호
  int volume; // 볼륨
  boolean isOn; // 전원상태

  void print() {
    System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  int getChannel() {
    return channel;
  }
}