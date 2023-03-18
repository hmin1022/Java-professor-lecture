package ch06;

public class Television {
  private int channel;
  private int volume;
  private boolean isOn;

  Television (int channel, int volume, boolean isOn) {
    this.channel = channel;
    this.volume = volume;
    this.isOn = isOn;
  }

  public void print() {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  public static void main(String[] args) {
    Television myTV = new Television(7, 10, true);
    myTV.print();
    Television yourTV = new Television(11, 20, true);
    yourTV.print();
  }
}
