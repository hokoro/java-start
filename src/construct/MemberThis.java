package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;  // 멤버 변수와 매개변수가 이름이 다를 경우에는 this를 생략해도 된다.
    }
}
