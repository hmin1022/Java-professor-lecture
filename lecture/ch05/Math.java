package lecture.ch05;

public class Math {
  int plus (int x, int y) { // plus 메소드
    return x + y; // x + y 값을 리턴한다.
  }
  public static void main(String[] args) {
    int sum; // int형 sum 정의
    Math math = new Math();   // math 인스턴스 생성 
    sum = math.plus(2, 3); // sum에 2와 3더한 결과값을 대입
    System.out.println("2와 3의 합은 " + sum + "입니다");
    sum = math.plus(7, 8); // sum에 7과 8더한 결과값을 대입
    System.out.println("7과 8의 합은 " + sum + "입니다");
  }
}
