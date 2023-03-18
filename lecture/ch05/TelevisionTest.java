package lecture.ch05;
public class TelevisionTest {
  
  public static void main(String[] args) {
    Television myTV = new Television();
  
    myTV.channel = 7; // myTV의 채널 7
    myTV.volume = 9; // myTV의 볼륨 9
    myTV.isOn = true; // myTV의 화면 on
    int ch = myTV.getChannel();
    System.out.println("현재 채널은 " + ch + " 입니다.");
    Television yourTV = new Television();

    yourTV.channel = 10; // yourTV 의 채널 10
    yourTV.volume = 5; // yourTV 의 볼륨 5
    yourTV.isOn = false; // yourTV의 화면

  System.out.println("텔레비전의 채널은 " + myTV.channel + "볼륨은 " + myTV.volume + " 입니다."); 
  System.out.println("텔레비전의 채널은 " + yourTV.channel + "볼륨은 " + yourTV.volume + " 입니다."); 
  }
  
}
