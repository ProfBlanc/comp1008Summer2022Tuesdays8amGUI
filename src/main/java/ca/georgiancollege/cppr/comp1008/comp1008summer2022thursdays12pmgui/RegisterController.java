package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {

    RegisterModel model = new RegisterModel();

    @FXML
    private TextField fieldUsername;

    @FXML
    private PasswordField fieldPassword;

    @FXML
    private PasswordField fieldPasswordConfirm;

    @FXML
    private Label labelError;

    @FXML
    void onReset(ActionEvent event) {
        fieldPassword.setText("");
        fieldUsername.setText("");
        fieldPasswordConfirm.setText("");
    }

    @FXML
    void onSubmit(ActionEvent event) {

        resetErrorField();
        model.setFields(fieldUsername.getText(), fieldPassword.getText(), fieldPasswordConfirm.getText());
        try{
            model.process();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Congrats");
            alert.setContentText("You have successfully registered!");
            alert.showAndWait();

            WindowChanger.close(event);
        }
        catch (Exception e){
            setErrorField(e.getMessage());
        }

    }
    void resetErrorField(){
        labelError.setText("");
    }
    void setErrorField(String content){
        labelError.setText(content);
    }
    @FXML
    void initialize(){
        resetErrorField();
    }


}
