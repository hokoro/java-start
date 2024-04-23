package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 선언을 할때 값을 넘겨 주면서 -> 객체를 불러라 + 생성자를 이용해 초기화까지 진행한다.
        MemberConstruct member1 = new MemberConstruct("user1" , 15 , 90);    // 선언과 동시에 멤버변수의 값을 넘겨줘서 값을 초기화 한다.
        MemberConstruct member2 = new MemberConstruct("user2" , 17 , 92);    // 선언과 동시에 멤버변수의 값을 넘겨줘서 값을 초기화 한다.

        MemberConstruct[] members = {member1 , member2};

        for(MemberConstruct member : members){
            System.out.println("사용자 이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
