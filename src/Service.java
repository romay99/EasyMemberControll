import java.util.Scanner;

public class Service {

    MemberDAO dao = MemberDAO.getDAO();
    Scanner sc = new Scanner(System.in);
    private int user_num = 1;

    //메뉴 출력
    public void showMenu(){
        System.out.println("사용하실 기능을 선택하여주세요.");
        System.out.println("1. 사용자 생성");
        System.out.println("2. 사용자 삭제");
        System.out.println("3. 특정 사용자 조회");
        System.out.println("4. 모든 사용자 조회");
        System.out.println("5. 프로그램 종료");
    }

    //멤버 생성메서드
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
        dao.createMember(member);
    }

    //멤버 제거메서드
    public void removeMember(){
        System.out.println("삭제할 사용자의 이름을 적어주세요.");
        String name = sc.nextLine();
        Member member = new Member();
        member.setName(name);
        dao.removeMember(member);
        System.out.println("삭제가 완료되었습니다.");
    }

    //특정 쥬저 조회 메서드
    public void findByName() {
        System.out.println("조회할 사용자의 이름을 적어주세요.");
        Member member = new Member();
        String name = sc.nextLine();
        member.setName(name);

        dao.findByName(member);
    }

    //모든 유저 조회메서드
    public void showAllMembers(){
        if (dao.findAllMembers() == null) {
            System.out.println("사용자가 존재하지 않습니다.");
        }else{
            for (Member m : dao.findAllMembers())
                System.out.println(m);
            }
        }

}


