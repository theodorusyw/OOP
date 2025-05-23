public class Message {
    public ILogin login;
    public String sender;
    public String recipient;
    public String content;

    public Message(ILogin login, String sender, String recipient, String content) {
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void send(String username, String passwordOrToken) {

    }
}
