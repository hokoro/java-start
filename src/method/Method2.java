package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader(){   // 반환 타입이 없는 겨우
        System.out.println("프로그램이 시작합니다.");
        return; // 반환할게 없기 때문에 값을 안넣어줘도 된다.
    }
    public static void printFooter(){
        System.out.println("프로그램을 종료합니다.");
    }
}
