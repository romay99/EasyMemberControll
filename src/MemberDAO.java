import com.sun.jdi.CharValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberDAO {
    private static MemberDAO daoinst = null;
    ArrayList<Member> repository = Repository.getRepository();
    private MemberDAO() {  // 생성자로 생성 막기
    }
    public static MemberDAO getDAO(){ // DAO 객체 전달해주는 메서드
        if (daoinst == null) {
            daoinst = new MemberDAO();
            return daoinst;
        }
        return daoinst;
    }

    public void createMember(Member member){
        repository.add(member);
    }


    public void removeMember(Member member){
        Member m = member;

        for (Member tmp : repository) {
            if (member.getName().equals(tmp.getName()))
                m = tmp;
        }
        repository.remove(m);
    }

    public void findByName(Member member){
        Member m = new Member();
        boolean haveMember = true;
        for (Member tmp : repository) {
            if (member.getName().equals(tmp.getName())) {
                haveMember = true;
            }else{
                haveMember = false;
            }
        }
        if (!haveMember) {
            System.out.println("존재하지 않는 사용자입니다.");
        }

    }

    public Member[] findAllMembers(){
        Member[] members = null;
        if (repository == null) {
            return members;
        }else{
            members = new Member[repository.size()];
            for (int i = 0; i < repository.size(); i++) {
                members[i] = repository.get(i);
            }
            return members;
        }

    }

}
