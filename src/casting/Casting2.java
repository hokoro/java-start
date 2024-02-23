package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doublevalue = 1.5;
        int intvalue = 0;

        //컴파일 오류 발생
        // 1.타입 불일치 , 2.double -> int convert 불가능
        //intvalue = doublevalue;
        // 소수점 때고 서라도 보고 싶으면
        intvalue = (int)doublevalue;    // 직접 자료형을 지정해서 변환 (명시적 형변환)

        System.out.println(doublevalue);    // 원래 값은 대입 연산자를 쓰지 않은 이상 바뀌지 않는다.
        System.out.println(intvalue);   // 대입 연산자를 사용했기 때문에 값이 바뀐다.
    }
}
