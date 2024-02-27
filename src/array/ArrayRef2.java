package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int [] students; // 배열 선언
        students = new int[5]; // 배열의 크기 설정

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i=0; i<students.length; i++){  // students.length -> length는 배열의 크기를 구할수 있다.
            System.out.println("학생"+(i+1)+" 점수: " + students[i]);
        }

    }
}
