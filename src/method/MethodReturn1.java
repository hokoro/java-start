package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);    // 홀수 인지 판단하는 함수
        System.out.println(result);
    }
    public static boolean odd(int i){
        if (i % 2 == 1){
            return true;
        }
        // 만약 홀수가 아닐때 에는 return 자료형이 있기 때문에 오류가 발생한다.
        else{
            return false;
        }
    }
}
