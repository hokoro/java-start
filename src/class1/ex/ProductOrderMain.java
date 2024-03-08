package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 상품 주문 정보를 담는 배열을 생성
        ProductOrder[] orderList = new ProductOrder[3];
        // 최종 금액을 알려줄 변수
        int totalPrice = 0;

        // 상품 정보를 저장
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        orderList[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        orderList[1] = product2;


        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;

        orderList[2] = product3;
        for (ProductOrder po : orderList){
            System.out.println("상품명: " + po.productName + " 가격: " + po.price + " 수량: " + po.quantity);
            totalPrice += (po.price * po.quantity);
        }
        System.out.println("총 결제 금액: " + totalPrice);

    }
}
