package com.cognizant.javafxmaven;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField textfield;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Click Test");
        label.setText("Hello " + textfield.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
