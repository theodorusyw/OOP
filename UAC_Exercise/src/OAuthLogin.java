public class OAuthLogin implements ILogin {
    private String expectedToken;

    public OAuthLogin(String expectedToken) {
        this.expectedToken = expectedToken;
    }

    @Override
    public boolean authenticate(String username, String token) {
        return expectedToken.equals(token);
    }
}
