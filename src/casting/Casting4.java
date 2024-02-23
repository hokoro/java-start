package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3/2; // 1.5
        System.out.println("div1 = " + div1); // int 형 변수 이기 때문에 int
        
        double div2 = 3/2; // 1.5
        System.out.println("div2 = " + div2); // int + int -> int
        
        double div3 = 3.0 / 2;  // 1.5
        System.out.println("div3 = " + div3);   // double + int -> double
        
        double div4 = (double) 3/2;
        System.out.println("div4 = " + div4);   // double 형 명시적 형변환

        int a = 3;
        int b = 2;
        double result = (double)a/b;
        System.out.println("result = " + result);   // double 명시적 형변환
    }
}
