package ch06;

public class Account {
  private int regNumber;
  private String name;
  private int balance;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int withdraw(int amount) {
    if (balance - amount < 0) {
      System.out.println("잔액이 부족합니다[" + balance + "]");
      return 0;
    }
    balance -= amount;

    return amount;
  }
}
