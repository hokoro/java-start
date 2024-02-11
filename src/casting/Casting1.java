package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longValue;
        double doubleValue;

        longValue = intvalue; // int -> long
        System.out.println("longValue = " + longValue); // 작은 범위를 큰범위에 넣는것은 형변환에 문제가 없다.
        
        doubleValue = intvalue;
        System.out.println("doubleValue = " + doubleValue); // 형변환은 되지만 소수점 형태로 출력된다.

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
