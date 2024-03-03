package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.ChangeNumber 호출전 : " + num1); // 5
        changeNumber(num1); // 5를 호출하여 넘김
        System.out.println("4.ChangeNumber 호출후 : " + num1); // 5
    }
    public static void changeNumber(int num2){
        System.out.println("2.ChangeNumber 변경전 : " + num2); // 곱하기 전에는 5
        num2 = num2  * 2;   //  곱한 후에는 10
        System.out.println("3.ChangeNumber 변경후 : " + num2);
    }
}
