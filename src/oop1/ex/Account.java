package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance += (amount);
        System.out.println("현재 잔액: " + balance);
    }
    void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액이 부족합니다");
        }else {
            balance -= (amount);
            System.out.println("현재 잔액: " + balance);
        }
    }
    void nowBalance(){
        System.out.println("현재 잔액: " + balance);
    }
}
