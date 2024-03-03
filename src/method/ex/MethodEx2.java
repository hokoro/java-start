package method.ex;

import java.awt.*;
import java.util.Scanner;

public class MethodEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("메세지를 반복할 횟수를 입력하세요: ");
        int count = scanner.nextInt();
        System.out.print("반복할 메세지 내용을 입력하세요: ");
        String message = scanner.next();

        printMessage(count , message);
    }
    public static void printMessage(int count , String message){
        for(int i = 0; i < count; i++){
            System.out.println(message);
        }
    }
}
