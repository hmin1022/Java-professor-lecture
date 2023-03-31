package ch07;

public class Car {
  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public static void main(String[] args) {
    SportCar sc = new SportCar();
    sc.setSpeed(150);
    sc.setTurbo(true);
    System.out.println(sc);
  }
}

class SportCar extends Car {
  private boolean turbo;

  public boolean isTurbo() {
    return turbo;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "speed : " + this.getSpeed() + " turbo : " + this.isTurbo();
  }

  public void setTurbo(boolean turbo) {
    this.turbo = turbo;
  }
}
