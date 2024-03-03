package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1.changeNumber 함수 호출전 :" + number);  // 5
        changeNumber(number);   // 호출할 때 number의 값을 복사해서 호출할 때 대입한다.
        System.out.println("4.changeNumber 함수 호출후 : " + number); // 5
    }
    public static void changeNumber(int number){
        System.out.println("2.changeNumber 변경 전 : " + number);  // 5
        number = number  * 2;    // 10
        System.out.println("3.changeNumber 변경 후 : " + number);  // 10

    }
}
