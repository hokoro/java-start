package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int []nums = new int[count];
        System.out.println(count + "개의 정수를 입력하세요: ");
        for(int i=0;i<count;i++){
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        int min = nums[0];

        for(int i = 1; i<nums.length;i++){
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println("가장 큰 정수는: " + max);
        System.out.println("가장 작은 수는: " + min);
    }
    
}
