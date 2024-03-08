package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 14;
        student2.grade = 80;

        // 클래스 배열을 사용하여 위에 객체들의 정보를 저장해보자
        Student[] students = {student1 , student2};

        for(int i =0; i<students.length; i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
        // 임의의 객체를 만들어 배열으로 선언하는 이름을 줄이는 방법
        for(int i = 0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
        // for each로 최적화
        for(Student s : students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}
