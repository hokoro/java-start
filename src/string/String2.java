package string;

public class String2 {
    public static void main(String[] args) {
        String a = "CHOCOLATE";
        String b = a;
        String c = "CHOCOLATE";

        String d = new String("CHOCOLATE");
        String e = "PASTA";

        System.out.println(a == b); // 같은 주소를 가르키기 때문에 true
        System.out.println(a.equals(b)); // 글자가 같기 때문에 true

        System.out.println(a == c); // 기본적으로 자바는 로컬함수 내에서 같은 문자열이 나오면 공유 상수로 관리한다.(pool)
        System.out.println(a.equals(c));

        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true

        System.out.println(a == e); // false
        System.out.println(a.equals(e)); // false
    }
}
