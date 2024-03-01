package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("1.상품 등록 | 2.상품 목록 | 3.종료\n 메뉴를 선택하세요:");
            int menu = scanner.nextInt();

            if (menu == 1) {
                if (productCount > maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.next();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
            }else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }else{
                    for(int i=0; i<productCount; i++){
                        System.out.println("상품 이름: " + productNames[i] + " 상품 가격: " + productPrices[i]);
                    }
                }
            }else{
                System.out.println("상품 등록 프로그램을 종료합니다.");
                break;
            }

        }

    }
    
}
