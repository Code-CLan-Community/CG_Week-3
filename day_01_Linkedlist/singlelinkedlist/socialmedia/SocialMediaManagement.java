
public class SocialMediaManagement {
    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();
        
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 27);
        network.addUser(3, "Charlie", 22);
        
        network.addFriend(1, 2);
        network.addFriend(2, 3);
        
        System.out.println("Displaying friends:");
        network.displayFriends(1);
        network.displayFriends(2);
        
        System.out.println("\nMutual Friends between 1 and 2:");
        network.findMutualFriends(1, 2);
        
        System.out.println("\nCounting friends for user 2:");
        network.countFriends(2);
        
        System.out.println("\nRemoving friend connection between 1 and 2:");
        network.removeFriend(1, 2);
        network.displayFriends(1);
    }
}
