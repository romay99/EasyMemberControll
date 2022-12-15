
public class Member {
    private int member_num;
    private String name;
    private String password;



    public int getMember_num() {
        return member_num;
    }

    public void setMember_num(int member_num) {
        this.member_num = member_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_num=" + member_num +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
