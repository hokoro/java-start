package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0){
                System.out.println("두 개의 숫자가 모두 0이기 때문에 프로그램을 종료합니다");
                break;
            }else {
                System.out.println("두 개의 숫자의 합은 : " + (num1 + num2));
            }
        }
    }
}
