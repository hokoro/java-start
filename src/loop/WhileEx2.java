package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while(count <= 20){
            if(i%2 ==0){
                System.out.println("i = " + i);
                count++;
            }else{
                continue;
            }
            i++;
        }
    }
}
