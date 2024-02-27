package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum_ = 0;
        int count = 0;
        while(true){
            int num = scanner.nextInt();
            if (num == -1){
                if (count != 0){
                    System.out.println("입력한 숫자들의 합계: " + (int)sum_);
                    System.out.println("입력한 숫자들의 평균: " + (sum_ / count));
                }else{
                    System.out.println("입력 받은 숫자가 없습니다");
                }
                break;
            }
            sum_ += num;
            count++;
        }

    }
}
