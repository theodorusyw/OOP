public class Message {
    protected ILogin login;
    protected String sender;
    protected String recipient;
    protected String content;

    public Message(ILogin login, String sender, String recipient, String content) {
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void send(String username, String passwordOrToken) {

    }
}
