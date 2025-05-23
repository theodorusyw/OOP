public class BasicLogin implements ILogin {
    public String expectedUsername;
    public String expectedPassword;

    public BasicLogin(String expectedUsername, String expectedPassword) {
        this.expectedUsername = expectedUsername;
        this.expectedPassword = expectedPassword;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return expectedUsername.equals(username) && expectedPassword.equals(password);
    }
}
