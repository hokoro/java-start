package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        } // if가 끝나면 temp의 사용을 줄여줄수 있다.
        //System.out.println("temp = " + temp);
        System.out.println("m = " + m);
    }
}
