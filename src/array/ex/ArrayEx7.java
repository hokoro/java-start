package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int count = scanner.nextInt();
        int korean,math,english;
        int [] scores = new int[count];
        for(int i = 0;i<count;i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수: ");
            korean = scanner.nextInt();
            System.out.print("수학 점수: ");
            math = scanner.nextInt();
            System.out.print("영어 점수: ");
            english = scanner.nextInt();
            scores[i] = korean + math + english;
        }
        for(int i = 0; i<count; i++){
            System.out.println((i+1) + "번 학생의 총점: " + scores[i]+", 평균: " + ((double)scores[i] / 3));
        }
    }
    
}
