package auth;

public class BasicLogin implements ILogin {
    private final String username;
    private final String password;

    public BasicLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}