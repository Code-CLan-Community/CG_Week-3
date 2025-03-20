import java.util.ArrayList;
import java.util.List;


class SocialMedia {
    private User head;

    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        newUser.next = head;
        head = newUser;
    }

    public User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            user1.friends.add(userID2);
            user2.friends.add(userID1);
            System.out.println("Friend connection added between " + userID1 + " and " + userID2);
        } else {
            System.out.println("One or both users not found");
        }
    }

    public void removeFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(userID2));
            user2.friends.remove(Integer.valueOf(userID1));
            System.out.println("Friend connection removed between " + userID1 + " and " + userID2);
        } else {
            System.out.println("One or both users not found");
        }
    }

    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friends);
            mutualFriends.retainAll(user2.friends);
            System.out.println("Mutual friends between " + userID1 + " and " + userID2 + ": " + mutualFriends);
        } else {
            System.out.println("One or both users not found");
        }
    }

    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + userID + ": " + user.friends);
        } else {
            System.out.println("User not found");
        }
    }

    public void searchUser(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("User Found: " + user.name + " (ID: " + user.userID + ", Age: " + user.age + ")");
        } else {
            System.out.println("User with ID " + userID + " not found");
        }
    }

    public void searchUser(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userID + ", Age: " + temp.age + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("User with name " + name + " not found");
    }

    public void countFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("User " + userID + " has " + user.friends.size() + " friends.");
        } else {
            System.out.println("User not found");
        }
    }
}

