package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //static은 클래스에서는 절대 사용하지 말아야 한다.
    void initMember(String name , int age , int grade){
        this.name = name;   // this는 멤버 변수에 값을 넣을때 매개변수와 멤버 변수가 같을 경우 구분을 하기위한 용도로 사용한다.
        this.age = age;
        this.grade = grade;
    }
}
