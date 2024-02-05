package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade){ // 조건에 어떤 변수의 값을 switch 문으로 쓸건지 결정

            case 1:
                coupon = 1000;
                break;  // switch 문을 사용할 때 break 를 사용해야 switch문 탈출이 가능하다.
            case 2:
            case 3:
                coupon = 3000;  // case2 에 해당하는 케이스문이 case3 문으로 실행된다.
                break;
            default:
                coupon = 500;

        }
        System.out.println("발급 받은 쿠폰 " + coupon);
    }
}
