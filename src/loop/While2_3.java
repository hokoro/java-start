package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endnum = 3;

        // i가 endnum 보다 작거나 같을때만 사용한다.
        while (i <= endnum){
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }


    }
}
