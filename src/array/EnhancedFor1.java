package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};


        for(int i=0;i<numbers.length;i++){
            int number = numbers[i];
            System.out.println(number);
        }
        
        // 향상된 for문 
        for (int number:numbers) {  // numbers 배열에 있는 원소 하나하나르 가져와서 사용한다.
            System.out.println(number);
        }
    }

}
