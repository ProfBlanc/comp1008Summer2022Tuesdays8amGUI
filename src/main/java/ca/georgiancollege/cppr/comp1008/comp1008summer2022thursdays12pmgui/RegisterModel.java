package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

public class RegisterModel {
    private String username, password, confirmPassword;
    private final String atLeastMessage = "must be at least 5 characters";
    public RegisterModel(){}
    public void setFields(String username, String password, String confirmPassword){
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    private void ensureAllFieldsAreAtLeastFiveCharacters(){

        if(username.length() < 5)
            throw new IllegalArgumentException("Username " + atLeastMessage);
        if(password.length() < 5)
            throw new IllegalArgumentException("Password " + atLeastMessage);

    }
    private void passwordsAreTheSame(){
        if(!password.equals(confirmPassword))
            throw new IllegalArgumentException("Passwords do not match");
    }

    public void process(){

        ensureAllFieldsAreAtLeastFiveCharacters();
        passwordsAreTheSame();

    }
}
