import java.util.ArrayList;

public class Repository {
    private static ArrayList<Member> memberArrayList;

    private Repository() {  //생성자로 생성못하게 막음.
    }

    public static ArrayList<Member> getRepository(){
        if (memberArrayList == null) {
            memberArrayList = new ArrayList<Member>();
        }
        return memberArrayList;

    }



}
