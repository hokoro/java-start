package loop;

public class ForEx2 {
    public static void main(String[] args) {
        for(int i=2;i<=20;i++){
            if(i%2 ==0){
                System.out.println("i = " + i);
            }else{
                continue;
            }
        }
    }
}
