package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    String str;
    @FXML
    private TextArea welcomeText;

    @FXML
    private TextField mainTextField;

    @FXML
    protected void onHelloButtonClick() {
        str = mainTextField.getText() + "\n";
        welcomeText.appendText(str);
        mainTextField.setText("");
    }

    @FXML
    public void onHelloTextFieldWrite() {
        str = mainTextField.getText() + "\n";
        welcomeText.appendText(str);
        mainTextField.setText("");
    }
}