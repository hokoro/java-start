package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + s2);

        // 문자열과 숫자 더하기
        String result3 = "a + b + " + 10;   // 문자와 숫자를 더할 때 는 숫자를 문자로 바꿔서 붙인다
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 20;               // 숫자
        String str = "a + b = ";    // 문자
        String result4 = str + num; // 문자 + 숫자 -> 숫자는 문자로 바뀐다.
        System.out.println(result4);

    }
}
