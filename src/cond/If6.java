package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){    // 연관성이 없는 조건이기 때문에 따로 따로 사용한다
            discount += 1000;
            System.out.println("10000원 이상 구매 1000원 할인");
        } else if (age <= 10){      // 하나의 조건식으로 묶으면 3개의 조건 중에서 하나만 실행이 된다.
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else{
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액 " + discount + "원");    // 따라서 결과적으로 1000원만 할인된다.
    }
}
