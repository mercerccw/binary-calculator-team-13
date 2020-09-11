package org.team13;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.lang.*;

public class CalculatorController {
    @FXML
    private Button ToggleButton;
    @FXML
    private Label evaluatedAnswer;
    @FXML
    private Label numberField;
    private Boolean isBinary = false;


    @FXML
    private void enterZero() {
        numberField.setText(numberField.getText()+ "0");
    }

    @FXML
    private void enterOne() {
        numberField.setText(numberField.getText() + "1");
    }

    @FXML
    private void clearNumberField() {
        numberField.setText("");
        evaluatedAnswer.setText("-");
        ToggleButton.setText("Binary");
        isBinary = false;
    }

    @FXML
    private void multiplyClicked() {
        //NOTE: to get current information from numberField use .getText() method
        //runs when multiButton is clicked
        numberField.setText(numberField.getText() + "*");
    }

    @FXML
    private void divideClicked() {
        //runs when divisionButton is clicked
        numberField.setText(numberField.getText() + "/");
    }

    @FXML
    private void addClicked(){
        //runs when additionButton is clicked
        numberField.setText(numberField.getText() + "+");
    }

    @FXML
    private void subtractClicked() {
        //runs when subtractionButton is clicked
        numberField.setText(numberField.getText() + "-");
    }

    @FXML
    private void squareClicked() {
        //runs when squaredButton is clicked
        try {
            if(numberField != null) {
                evaluatedAnswer.setText(Operations.findSquare(numberField.getText()));
            }
        } catch (Exception e){
            System.out.println("Invalid number entered: " + e);
        }

    }

    @FXML
    private void sqrtClicked() {
        //runs when sqrtButton is clicked
        try {
            if(numberField != null) {
                evaluatedAnswer.setText(Integer.toString(Operations.findSqrt(numberField.getText())));
            }
        } catch (Exception e){
            System.out.println("Invalid number entered: " + e);
        }

    }

    @FXML
    private void equalClicked() {
        //runs when equalsButton is clicked
        try{
            String[] input = Operations.sanitize(numberField.getText());
            evaluatedAnswer.setText(Operations.evaluate(input));
        } catch (Exception e) {
            e.printStackTrace();
        }


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
        try {
            if(numberField != null) {
                evaluatedAnswer.setText(Operations.convertBinaryOrDecimal(numberField.getText(), true));
            }
        } catch (Exception e){
            System.out.println("Invalid number entered: " + e);
        }

    }



}
