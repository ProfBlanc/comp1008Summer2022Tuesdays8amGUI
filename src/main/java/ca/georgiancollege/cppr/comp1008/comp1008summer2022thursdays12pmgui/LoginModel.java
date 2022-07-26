package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

public class LoginModel {

    private String username, password;
    private final String targetUsername = "admin", targetPassword = "pass";

    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
    void process() throws Exception
    {

        if(username.equals(targetUsername) && password.equals(targetPassword)){}
        else{
            throw new Exception(String.format("Username/Password combo of '%s'/'%s' is incorrect",
                    username, password));
        }
    }

}
