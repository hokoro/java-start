package method.overloading;

public class OverLoading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2 , 1);
    }
    public static void myMethod(int a , double b){
        System.out.println("1번 함수 호출 ");
        System.out.println("a: " + a  + " b: " + b);
    }
    public  static void myMethod(double a , int b){
        System.out.println("2번 함수 호출 ");
        System.out.println("a: " + a  + " b: " + b);
    }
}
