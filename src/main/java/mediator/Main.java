package mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hey Alice!");
        user3.sendMessage("Hi Alice and Bob!");
    }
}
