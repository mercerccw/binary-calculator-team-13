package org.team13;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.lang.*;

public class CalculatorController {
    @FXML
    private Button ToggleButton;
    @FXML
    private Label evaluatedAnswer;
    @FXML
    private TextField numberField;
    private Boolean isBinary = false;


    @FXML
    private void enterZero() {
        numberField.appendText("0");
    }

    @FXML
    private void enterOne() {
        numberField.appendText("1");
    }

    @FXML
    private void clearNumberField() {
        numberField.clear();
        evaluatedAnswer.setText("-");
        ToggleButton.setText("Binary");
        isBinary = false;
    }

    @FXML
    private void multiplyClicked() {
        //NOTE: to get current information from numberField use .getText() method
        //runs when multiButton is clicked
    }

    @FXML
    private void divideClicked() {
        //runs when divisionButton is clicked
    }

    @FXML
    private void addClicked(){
        //runs when additionButton is clicked
    }

    @FXML
    private void subtractClicked() {
        //runs when subtractionButton is clicked
    }

    @FXML
    private void squareClicked() {
        //runs when squaredButton is clicked

    }

    @FXML
    private void sqrtClicked() {
        //runs when sqrtButton is clicked
        if(numberField != null) {
            evaluatedAnswer.setText(Double.toString(Operations.findSqrt(numberField.getText())));
        }
    }

    @FXML
    private void equalClicked() {
        //runs when equalsButton is clicked

    }

    @FXML
    private void toggleType(){
        if(!evaluatedAnswer.getText().equals("-")) {
            try {
                evaluatedAnswer.setText(Operations.convertBinaryOrDecimal(Integer.toString(Integer.parseInt(evaluatedAnswer.getText())), isBinary));
                if(isBinary)
                    ToggleButton.setText("Binary");
                else
                    ToggleButton.setText("Integer");
                isBinary = !isBinary;
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }

        }
    }

    @FXML
    private void toDecimal() {
        //runs when toDecimal is clicked
        if(numberField != null) {
            evaluatedAnswer.setText(Operations.convertBinaryOrDecimal(numberField.getText(), true));
        }
    }



}
