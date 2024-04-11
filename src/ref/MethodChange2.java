package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("dataA = " + dataA.value);
        changeRefernece(dataA);
        System.out.println("dataA = " + dataA.value);

    }
    public static void changeRefernece(Data data){
        data.value = 20;
    }
}
