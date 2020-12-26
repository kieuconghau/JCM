package jcm.api.users.response;

public class LoginAccountResult {
    protected int id;
    protected String accessToken;
    protected String email;
    protected String fullname;

    public String getFullname() {
        return fullname;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
