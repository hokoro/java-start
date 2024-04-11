package ref;

public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //B객체의 참조 주소를 A로 변경

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
        
        dataA.value = 20;   // 참조되는 값이 변경 됐기 때문에 B도 변경
        System.out.println("dataA = " + dataA.value);
        System.out.println("dataB = " + dataB.value);
        
        dataB.value = 30;   // A랑 B가 같은 주소를 가르키기 때문에 두개의 값이 바뀐다.
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
