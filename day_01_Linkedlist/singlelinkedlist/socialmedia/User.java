import java.util.ArrayList;
import java.util.List;
class User {
    int userID;
    String name;
    int age;
    List<Integer> friends;
    User next;

    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
