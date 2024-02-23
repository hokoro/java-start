package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intvalue1 = scanner.nextInt();
        int intvalue2 = scanner.nextInt();

        if (intvalue1 == intvalue2){
            System.out.println("두 수가 같습니다.");
        }else{
            if (intvalue1 > intvalue2){
                System.out.println("intvalue1이 더 큽니다");
            }else {
                System.out.println("intvalue2가 더 큽니다.");
            }
        }
    }
}
