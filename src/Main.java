import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on_off = true;
        Service menu = new Service();
        MemberDAO dao = MemberDAO.getDAO();

        while (on_off) {
            menu.showMenu();

            switch (sc.nextInt()){
                case 1:
                    menu.createMember();
                    break;
                case 2:
                    menu.removeMember();
                    break;
                case 3:
                    menu.findByName();
                    break;
                case 4:
                    menu.showAllMembers();
                    break;
                case 5:
                    on_off = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }


        }










    }
}