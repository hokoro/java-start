package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열1";

        boolean result2 = "hello".equals("hello"); // 문자열 리터럴 비교
        boolean result3 = str1.equals("문자열1");// 문자열 변수 , 리터럴 비교
        boolean result4 = str1.equals(str2); // 문자열 변수 끼리 같은가
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
