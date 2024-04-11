package ref;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문을 담는 배열 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문 개수를 입력하세요: ");
        int count = scanner.nextInt();
        ProductOrder [] products = new ProductOrder[count];
        int idx = 0;
        String name;
        int price , quantity;
        // createOrder를 사용하여 상품 주문 정보들을 생성하고 저장
        while (true){
            if(idx >= count){
                System.out.println("등록할 수 있는 제품의 수량을 넘겼습니다.");
                break;
            }
            System.out.print("제품의 이름을 입력하세요: ");
            name = scanner.next();
            System.out.print("제품의 가격을 입력하세요: ");
            price = scanner.nextInt();
            System.out.print("제품의 수량을 입력하세요: ");
            quantity = scanner.nextInt();
            products[idx] = createOrder(name , price , quantity);
            idx++;
        }
        // printOrder를 이용하여 상품 주문 정보 출력
        int find;
        while(true){
            System.out.print("찾고 싶은 제품의 번호를 입력하세요: ");
            find = scanner.nextInt();
            if(find >= count){
                System.out.println("등록된 제품이 없습니다. 다시 입력해주세요");
                continue;
            } else if (find < 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else{
                printOrder(products[find]);
            }
        }
        // getTotalAmount 를 사용하여 총 결제 금액 계산
        getTotalAmount(products);
    }
    static ProductOrder createOrder(String name , int price , int quantity){
        ProductOrder pro = new ProductOrder();
        pro.productName = name;
        pro.price = price;
        pro.quantity = quantity;
        return pro;
    }
    static void printOrder(ProductOrder pro){
        System.out.println("제품명: " + pro.productName + " 가격: " + pro.price + " 수량: " + pro.quantity);
    }
    static void getTotalAmount(ProductOrder[] pros){
        int sum = 0;
        for(int i = 0; i < pros.length; i++){
            sum += (pros[i].price * pros[i].quantity);
        }
        System.out.println("모든 제품을 합한 가격은: " + sum + "원 입니다.");
    }
}
