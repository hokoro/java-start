package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1" , 15);    // 성적을 받지 않은 생성자 사용
        MemberConstruct member2 = new MemberConstruct("user2" , 17 , 90);   // 성적을 받는 생성자 사용

        MemberConstruct[] members = {member1 , member2};

        for(MemberConstruct member : members){
            System.out.println("사용자 이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
