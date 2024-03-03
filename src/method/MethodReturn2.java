package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    public static void checkAge(int age){
        if (age < 18){
            System.out.println(age + "살은 미성년자라 출입할 수 없습니다.");
            return; // void 이지만 return문을 만나면 자동으로 함수를 빠져 나온다.
        }else {
            System.out.println(age + "살은 입장하세요");
            return;
        }
    }
}
