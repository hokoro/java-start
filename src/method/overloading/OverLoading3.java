package method.overloading;

public class OverLoading3 {
    public static void main(String[] args) {
        System.out.println(add(1,2));   // 1번 함수 호출
        System.out.println(add(1.1,2.2)); // 2번 함수 호출
    }

    public static int add(int a , int b){
        System.out.println("정수형 수 더하기 ");
        return a + b;
    }
    public static double add(double a , double b){
        System.out.println("실수형 수 더하기");
        return a + b;
    }

}
