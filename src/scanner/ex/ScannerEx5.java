package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 :");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 :");
        int num2 = scanner.nextInt();
        System.out.print("두 숫자 사이의 모든 정수 : ");
        if (num1 <= num2){
            int i = num1;
            while(true){
                if (i == num2){
                    System.out.print(i);
                    break;
                }
                System.out.print(i + ",");
                i += 1;
            }
        }else{
            int i = num2;
            while (true){
                if(i == num1){
                    System.out.print(i);
                    break;
                }
                System.out.print(i+",");
                i += 1;
            }
        }
    }
}
