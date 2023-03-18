package ch06;

public class Student {
  private int number;
  private String name;
  private int age;

  Student() { // 생성자
    number = 100;
    name = "New Student";
    age = 19;
  }

  Student(int number, String name, int age) { // 생성자 int number String name int age 지정
    this.number = number;
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Student [number = " + number + ", name=" + name + ", age=" + age +"]";
  }

  public static void main(String[] args) {
    Student std1 = new Student();
    System.out.println(std1);

    Student std2 = new Student(111, "kim", 24);
    System.out.println(std2);
  }
}
