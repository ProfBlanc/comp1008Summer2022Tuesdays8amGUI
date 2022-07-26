package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {


    @FXML
    TextField fieldUsername;

    @FXML
    PasswordField fieldPassword;

    @FXML
    Label labelError;

    //event/method named initialize: runs after all Nodes (javafx components are loaded)
    //initialize like the constructor of the View

    @FXML
    void initialize(){

        System.out.println("Hello");

        labelError.setVisible(false);
        //labelError.setStyle("-fx-background-color: black; -fx-text-fill: white");
    }

    @FXML
    void onLoginClick(ActionEvent event) {

        labelError.setVisible(false);
        Button clicked = (Button)event.getSource();

        System.out.println("User clicked on button with text of " + clicked.getText());

        String username = fieldUsername.getText();
        String password = fieldPassword.getText();

        /*
        if(username.equals("admin") && password.equals("pass")){
            System.out.println("Congrats! You may enter");
        }
        else{
            labelError.setText("username/password combo of " + username + "/" + password + " is incorrect");
            labelError.setVisible(true);
        }
         */
        try{
            LoginModel model = new LoginModel(username, password);
            model.process();
        }
        catch (Exception e){
            labelError.setVisible(true);
            labelError.setText(e.getMessage());
        }

    }

    @FXML
    void onRegisterClick(ActionEvent event) {
        labelError.setVisible(false);

    try {
        WindowChanger.open("register-view", "Register Example");
    }
    catch (Exception e){
        labelError.setVisible(true);
        labelError.setText("Unable to load new window");
    }


    }


    public LoginController(){} //is called BEFORE any javafx components are loaded

}
