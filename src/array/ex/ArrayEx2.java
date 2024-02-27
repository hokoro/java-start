package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for(int i = 0; i < nums.length; i++){
            if (i != nums.length -1){
                System.out.print(nums[i] + ", ");
            }else {
                System.out.print(nums[i]);
            }
        }
    }
}
