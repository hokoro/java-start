package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18){
            System.out.println("성인입니다.");
        }

        if(age < 18){ // false 인 조건식은 실행이 안된다.
            System.out.println("미성년자 입니다.");
        }


    }
}
