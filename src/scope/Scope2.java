package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i=0; i<2; i++){
            System.out.println("for m = " + m); // main 안에 지역변수
            System.out.println("for i =" + i);  //for 문안 지역변수
        } // i는 외부에서는 사용 불가능하다.
        System.out.println("main m = " + m); // main 안에 변수라 접근 가능
        //System.out.println("main i = " + i); // i는 접근 불가
    }
}
