package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // 현재 코드에서 num1 = 5 , num2 = 5
        num2 = 10; // num2 = 10으로 변경
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
