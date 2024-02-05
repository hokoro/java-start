package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println("전위 증감 연산 수행");
        System.out.println("a = " + a); // a = 1
        System.out.println("b = " + b); // b = 0

        // 전위 연산
        b = ++a; // a를 먼저 증가시키고 b에 저장한다 즉 증가된 a 값을 b에 초기화 한다.
        System.out.println("a = " + a); //  a = 2
        System.out.println("b = " + b); //  b = 2
        System.out.println("--------------------------------------------------------");

        System.out.println("후위 증감 연산 수행");
        // 후위 증감 연산자
        a = 1; // a = 1
        b = 0; // b = 0

        System.out.println("a = " + a); //  a = 1
        System.out.println("b = " + b); //  b = 0

        b = a++; // a를 b에 먼저 대입하고 그 다음에 a를 증가
        System.out.println("a = " + a); //  a = 2
        System.out.println("b = " + b); //  b = 1


    }
}
