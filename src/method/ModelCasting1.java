package method;

public class ModelCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        System.out.println("함수 호출전 : " + number);
        printNumber((int) number);  // 명시적 형변환 1.5 -> 1
    }
    public static void printNumber(int n){
        System.out.println("숫자 : " + n); //1
    }
}
