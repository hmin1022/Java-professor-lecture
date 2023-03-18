package ch06;

public class Test {
  public static void main(String[] args) {
    AccessModifierTest01 amf = new AccessModifierTest01();

    //amf.privateVariable = 100; // private member는 클래스 밖에서 접근 불가
    amf.defaultVariable = 200; // default member는 통일 패키지에서 접근 가능
    amf.protectedVariable = 300; // protected member는 통일 패키지 접근 가능
    amf.publicVariable = 400; // public member는 어디서든 접근 가능

    amf.print();
  }
}
