package variable;

public class Var6 {
    public static void main(String[] args) {
        // 변수 초기화를 해야하는 이유
        int a; // 해당 변수는 지역 변수 이다.
        a = 10;
        System.out.println(a); // 변수 안에 값이 존재하지 않기 때문에 초기화를 반드시 해야한다. 에러 발생시에는 컴파일러가 초기화를 해주지 않은다.

    }
}
