package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // scanner를 생성

        // 문자 입력
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        // 정수 입력
        System.out.print("정수를 입력하세요: ");
        int intvalue = scanner.nextInt();
        System.out.println("입력한 정수: " + intvalue);

        // 실수 입력
        System.out.print("실수를 입력하세요: ");
        double doublevalue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doublevalue);
    }
}
