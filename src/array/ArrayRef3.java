package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int [] students; // 배열 선언
        students = new int[]{90,80,70,60,50};   // 배열의 들어가는 값을 초기화 할 수 있다.

        for (int i=0; i<students.length; i++){  // students.length -> length는 배열의 크기를 구할수 있다.
            System.out.println("학생"+(i+1)+" 점수: " + students[i]);
        }

    }
}
