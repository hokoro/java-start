package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.changeNumber 함수 호출전 :" + num1);  // 5
        num1 = changeNumber(num1);   // 호출할 때 number의 값을 복사해서 호출할 때 대입한다.
        System.out.println("2.changeNumber 함수 호출후 : " + num1); // 10
    }
    public static int changeNumber(int num2){
        num2 = num2 * 2;
        return num2;
    }
}
