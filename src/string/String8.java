package string;

public class String8 {
    public static void main(String[] args) {
        String str1 = "문자열을 공부해봅시다.";
        String str2 = "감있는 사람";
        String str3 = "촉없는 사람";

        System.out.println(str1.startsWith("문"));
        System.out.println(str1.startsWith("문제"));

        System.out.println(str2.startsWith("감"));
        System.out.println(str2.startsWith("촉"));

        System.out.println(str3.startsWith("감"));
        System.out.println(str3.startsWith("촉"));


    }
}
