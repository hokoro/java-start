package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];

        System.out.println("5개의 정수를 입력하시오");
        
        for(int i = 0; i<5;i++){
            arrays[i] = scanner.nextInt();
        }
        for(int i = 0; i<5;i++){
            if(i == 4){
                System.out.print(arrays[4-i]);
            }else{
                System.out.print(arrays[4-i] + ", ");
            }
        }
    }
    
}
