package ch06;

public class Box {
  
  private int width;
  private int length;
  private int height;
  private int volume;

  int getVolume() {
   volume = height * length * width;
    return volume;
  }

  Box (int width, int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  public static void main(String[] args) {
    Box box = new Box(20, 20, 30);

    System.out.println("상자의 부피는 " + box.getVolume() + "입니다.");
  }
}