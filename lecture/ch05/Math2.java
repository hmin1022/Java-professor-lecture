package lecture.ch05;

public class Math2 {
  int add(int x, int y) {
    return x + y;
  }
// 메소드 오버로딩 (Method Overloading)
// int형 square 메소드 : 이름이 같아도 타입이 다르면 동일한 이름을 사용할 수 있다.
  int square(int i) {
    return i * i;
  }
// double형 square 메소드
  double square(double i) {
    return i * i;
  }

  public static void main(String[] args) {
    Math2 obj = new Math2();
    System.out.println(obj.square(10));
    System.out.println(obj.square(3.14));
  }
}
