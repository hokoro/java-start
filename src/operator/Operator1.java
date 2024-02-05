package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //  문자열 + 숫자 형식으로 출력 가능

        // 뺼셈
        int diff = a-b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나누기
        int div = a / b;
        System.out.println("a / b = " + div); // 원래는 2.5로 나와야 하지만 int 형 끼리의 계산이기 떄문에 소수점 표현이 안된다.

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 몫을 나누고 난 후에 나머지
    }
}
