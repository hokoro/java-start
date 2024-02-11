package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m은 psvm 안에서 생존하는 변수
        if (true){
            int x = 20; // if 안에 있는 블록에서만 적용
            System.out.println("if m = " + m); // if 가 psvm 안에 있기 때문에 if 안에서도 변수 값을 확인 할 수 있다.
            System.out.println("if x = " + x); // if 안에 있기 때문에 지역변수로 사용 가능
        }
        // x는 if 밖에서는 사용 불가능 하다
        //System.out.println("x = " + x); // if 안에 선언했기 때문에 에러가 난다.
        System.out.println("m = " + m);
    }
}
