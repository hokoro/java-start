package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5 , 10); // 함수를 호출
        System.out.println("연산 결과: " + sum1);   // 연산 결과 리턴
        System.out.println("===============================");


        // 계산 2
        int sum2 = add(10,20);
        System.out.println("연산 결과: " + sum2);
        System.out.println("===============================");
    }
    public static int add (int a , int b){
        System.out.println(a + "+" + b + " 연산수행");
        int sum = a + b;
        return sum; // 계산 결과를 리턴
    }
}
