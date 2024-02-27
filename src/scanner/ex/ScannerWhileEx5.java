package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        int price = 0, count = 0;
        int totalcost = 0;
        while (true) {
            System.out.println("1:상품 입력,2:결제,3:프로그램 종료");
            int option = scanner.nextInt();
            if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                item = scanner.next();
                System.out.print("상품의 가격을 입력하세요: ");
                price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                count = scanner.nextInt();
                totalcost += (price * count);
                System.out.println("상품명: "+item+" 가격: "+price+" 합계: " +(price * count));
                System.out.println("현재 총 비용: " + totalcost);
            } else if (option == 2) {
                System.out.println("총 비용: " + (totalcost));
                price = 0;
                count = 0;
                totalcost = 0;
            }else {
                System.out.println("해당되는 옵션이 없습니다.");
                continue;
            }

        }
        
    }
}
