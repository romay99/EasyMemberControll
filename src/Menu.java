

public class Menu {
    MemberDAO dao = new MemberDAO();

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
        dao.createMember();
    }

    //멤버 제거메서드
    public void removeMember(){
        dao.removeMember();
    }

    //특정 쥬저 조회 메서드
    public void findByName(){
        Member member = dao.findByName();
        if(member.getMember_num() == 0){  // createMember() 로 생성되지 않는 객체는 null;
            System.out.println("존재하지 않는 사용자입니다.");
        } else{
            System.out.println(member);
        }
    }

    //모든 유저 조회메서드
    public void showAllMembers(){
        dao.findAllMembers();
    }

}
