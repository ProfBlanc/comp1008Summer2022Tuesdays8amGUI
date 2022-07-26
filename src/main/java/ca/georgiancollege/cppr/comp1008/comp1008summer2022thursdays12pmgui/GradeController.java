package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GradeController {

    @FXML
    private Label labelLetter;

    @FXML
    private TextField fieldGrade;

    GradeModel model = new GradeModel();

    @FXML
    void convertScoreToGrade(ActionEvent event) {

        try {
            model.setGrade(fieldGrade.getText());
            model.process();
            labelLetter.setText(model.getLetter());
        }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setContentText(e.getMessage());
            alert.show();
        }
        

    }

    void clearFields(){
        labelLetter.setText("");
        fieldGrade.setText("");
    }
    @FXML
    void initialize(){

        clearFields();
    }

}
