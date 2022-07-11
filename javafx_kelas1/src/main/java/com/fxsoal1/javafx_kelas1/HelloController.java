package com.fxsoal1.javafx_kelas1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    public TextField num1;

    public TextField num2;

    public TextField count;

    public void sum(ActionEvent actionEvent) {
        int a = getIntFromTextField(num1);
        int b = getIntFromTextField(num2);
        count.setText(String.valueOf(a + b));
    }

    public void min(ActionEvent actionEvent) {
        int a = getIntFromTextField(num1);
        int b = getIntFromTextField(num2);
        count.setText(String.valueOf(a - b));
    }

    public void times(ActionEvent actionEvent) {
        int a = getIntFromTextField(num1);
        int b = getIntFromTextField(num2);
        count.setText(String.valueOf(a * b));
    }

    public void div(ActionEvent actionEvent) {
        int a = getIntFromTextField(num1);
        int b = getIntFromTextField(num2);
        count.setText(String.valueOf(a / b));
    }

    private static int getIntFromTextField(TextField t) {
        return Integer.parseInt(t.getText());
    }
}