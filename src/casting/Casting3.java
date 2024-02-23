package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int의 최대값 , 리터럴
        long maxIntOver = 2147483648L; // int의 최대값 + 1(초과) , 초과된 값을 표현하기 위해서는 L 표기법을 사용해야 한다.
        int intvalue = 0;
        
        intvalue = (int) maxIntValue; // 형변환 , int의 최고 범위까지 표현가능하기 때문에 가능하다.
        System.out.println("intvalue = " + intvalue);

        intvalue = (int) maxIntOver; // 형변환 , int의 범위를 넘어선 경우
        System.out.println("intvalue = " + intvalue);   //  int를 넘기면 제일 작은 범위이로 돌아간다 그 이후로 수가 증가하면 작은 범위에서 증가한다.
    }
}
