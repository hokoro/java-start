package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                System.out.println("전체 합계를 출력하고 프로그램을 종료합니다 " + sum);
                break;
            }else{
                sum += num;
            }
        }
    }
}
