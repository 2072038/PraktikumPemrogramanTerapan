package com.fxsa.javafx_soal2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class HelloController {

    public TextField result;

    private String operator = "+";
    private double num1 = 0;

    void onNumberClicked(MouseEvent event) {
        int val = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        result.setText(Double.parseDouble(result.getText())==0?String.valueOf((double)val):String.valueOf(Double.parseDouble(result.getText())*10+val));
    }

    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if(symbol.equals("Equals")) {
            double num2 = Double.parseDouble(result.getText());
            switch (operator) {
                case "+" -> result.setText((num1+num2) + "");
                case "-" -> result.setText((num1-num2) + "");
                case "*" -> result.setText((num1*num2) + "");
                case "/" -> result.setText((num1/num2) + "");
            }
            operator = ".";
        }
        else if(symbol.equals("Clear")) {
            result.setText(String.valueOf(0.0));
            operator = ".";
        }
        else {
            switch (symbol) {
                case "Plus" -> operator = "+";
                case "Minus" -> operator = "-";
                case "Multiply" -> operator = "*";
                case "Divide" -> operator = "/";
            }
            num1 = Double.parseDouble(result.getText());
            result.setText(String.valueOf(0.0));
        }
    }
}