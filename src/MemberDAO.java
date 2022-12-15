import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberDAO {
    private int user_num = 1;  // createMember() 메소드로 유저를 생성했을때만 ++ ;
    Scanner sc = new Scanner(System.in);
    ArrayList<Member> repository;

    public MemberDAO() {
        this.repository = Repository.getRepository();
    }

    public void createMember(){
        Member member = new Member();
        System.out.println("생성할 사용자의 이름을 적어주세요");
        String name = sc.nextLine();
        System.out.println("생성할 사용자의 비밀번호를 적어주세요.");
        String password = sc.nextLine();

        member.setName(name);
        member.setPassword(password);
        member.setMember_num(user_num);
        user_num++;
        repository.add(member);
    }


    public void removeMember(){
        System.out.println("삭제할 사용자의 이름을 적어주세요");
        String name = sc.nextLine();
        Member member=new Member();

        for (Member tmp : repository){
            if (tmp.getName().equals(name)) {
                member = tmp;
            }
        }
            repository.remove(member);
    }

    public Member findByName(){
        System.out.println("조회할 사용자의 이름을 적어주세요");
        String name=sc.nextLine();
        Member member = new Member();

        for (Member tmp : repository){
            if (tmp.getName().equals(name)) {
                member=tmp;
            }
        }
        return member;
    }

    public void findAllMembers(){
        if (repository == null){
            System.out.println("사용자가 존재하지 않습니다.");
        }else{
            for(Member m : repository)
                System.out.println(m);
        }
    }

}
