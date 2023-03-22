package ch06;

public class Time {
  private int hour; // 0 ~ 23
  private int minute; // 0 ~ 59
  private int second; // 0 ~ 59

  public Time() {
    this(0, 0, 0);
  }

  public Time(int h, int m, int s) {
    this.hour = h;
    this.minute = m;
    this.second = s;

    if (this.hour > 23) {
      this.hour = 0;
    }
    if (this.minute > 59) {
      this.minute = 0;
    }
    if (this.second > 59) {
      this.second = 0;
    }
  }

  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
