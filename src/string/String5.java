package string;

public class String5 {
    public static void main(String[] args) {
        String str1 = "substring 함수를 공부해 봅시다";
        String str2 = "abcdef";
        String str3 = "ghijkl";

        System.out.println(str1.substring(0 , 9));  // 시작 인덱스 , 끝 인덱스 -1 까지 데이터를 부분 문자열 시킨다.
        System.out.println(str2.substring(0)); // 시작 인덱스만 있을시 시작부터 끝 인덱스까지 전부 부분 문자열을 나타낸다

    }
}
