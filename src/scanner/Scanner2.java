package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int intvalue1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int intvalue2 = scanner.nextInt();

        System.out.println("두 수의 합은 : " + (intvalue1 + intvalue2));


    }
}
