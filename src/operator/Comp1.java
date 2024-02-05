package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // 2 != 3 이기 때문에 false
        System.out.println(a != b); // 2 != 3 이기 때문에 true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        boolean result = a == b;    // 결과 값이 boolean 이기때문에 boolean 자료형에 대입하여 사용가능하다
        System.out.println(result); // false
    }
}
