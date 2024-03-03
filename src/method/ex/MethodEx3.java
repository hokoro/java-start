package method.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        int Account = 0; // 현재 계좌의 잔액
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("현재 통장의 잔액: " + Account);
            System.out.println("1.입금 , 2.출금 , 3.프로그램 종료");
            System.out.print("사용하고 싶은 기능을 입력하세오: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금할 금액을 입력하세요");
                int depositmoney = scanner.nextInt();
                Account = deposit(Account , depositmoney);
            } else if (menu == 2) {
                System.out.print("출금할 금액을 입력하세요: ");
                int withdrawmoney = scanner.nextInt();
                if (Account < withdrawmoney){
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }else {
                    Account = withdraw(Account , withdrawmoney);
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
    public static int deposit(int account , int money){
        System.out.println("현재 통장의 잔액: " + account);
        System.out.println("입금할 금액: " + money);
        account = account + money;
        System.out.println("입금후 잔액: " + account);
        return account;
    }
    public static int withdraw(int account , int money){
        System.out.println("현재 통장의 잔액: " + account);
        System.out.println("출금할 금액: " + money);
        account = account - money;
        System.out.println("출금후 잔액: " + account);
        return account;
    }
}
