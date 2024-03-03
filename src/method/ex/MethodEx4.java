package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int account = 0; // 현재 계좌의 잔액
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();
            if (menu == 4){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu == 1) {
                System.out.print("입금할 금액을 입력하세요: ");
                int money = scanner.nextInt();
                account = deposit(account , money);

            } else if (menu == 2) {
                System.out.print("출금할 금액을 입력하세요");
                int money = scanner.nextInt();
                account = withdraw(account , money);
            } else if (menu == 3) {
                System.out.println("현재 잔액: " + account);
            }
        }
    }
    public static int deposit(int account , int money){
        account += money;
        System.out.println( money+ "원을 입금하였습니다. " + "현재 잔액: " + account + "원.");
        return account;
    }
    public static int withdraw(int account , int money){
        if(account < money){
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다");
            return account;
        }
        account -= money;
        System.out.println(money+"원을 출급하였습니다. 현재 잔액: " + account);
        return account;
    }
}
