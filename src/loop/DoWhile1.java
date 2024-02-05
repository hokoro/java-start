package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        // do-while
        do{ // 첫 실행은 조건 없이 무조건 실행
            System.out.println("현재 숫자는:" + i);
        }while (i < 3); // 다음 반복부터 true이면 실행


        // while
        while (i < 3){  // 해당 코드는 false라 실행되지 않는다.
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
