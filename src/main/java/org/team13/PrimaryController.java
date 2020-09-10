package org.team13;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

    private boolean operandClicked = false;
    private String operandMode = "";
    private boolean isDecimal = false;

    @FXML
    private TextField numberField;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

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
        operandClicked = false;
        operandMode = "";
    }

    @FXML
    private void multiplyClicked() {
        //NOTE: to get current information from numberField use .getText() method
        //runs when multiButton is clicked
        if (!operandClicked){
            numberField.appendText("*");
            operandClicked = true;
            operandMode = "\\*";
        }
    }

    @FXML
    private void divideClicked() {
        //runs when divisionButton is clicked
        if (!operandClicked){
            numberField.appendText("/");
            operandClicked = true;
            operandMode = "\\/";
        }
    }

    @FXML
    private void addClicked(){
        //runs when additionButton is clicked
        if (!operandClicked){
            numberField.appendText("+");
            operandClicked = true;
            operandMode = "\\+";
        }
    }

    @FXML
    private void subtractClicked() {
        //runs when subtractionButton is clicked
        if (!operandClicked){
            numberField.appendText("-");
            operandClicked = true;
            operandMode = "\\-";
        }
    }

    @FXML
    private void squareClicked() {
        //runs when squaredButton is clicked
    }

    @FXML
    private void sqrtClicked() {
        //runs when sqrtButton is clicked
    }

    @FXML
    private void equalClicked() {
        //runs when equalsButton is clicked
        String operation = numberField.getText();
        String[] numbers = operation.split(operandMode);
        Integer leftSide = Integer.parseInt(numbers[0],2);
        Integer rightSide = Integer.parseInt(numbers[1],2);

        Integer result;
        switch(operandMode){
            case("\\+"):
                result = leftSide + rightSide;
                numberField.setText(Integer.toBinaryString(result));
                break;
            case("\\-"):
                result = leftSide - rightSide;
                numberField.setText(Integer.toBinaryString(result));
                break;
            case("\\/"):
                result = leftSide/rightSide;
                numberField.setText(Integer.toBinaryString(result));
                break;
            case("\\*"):
                result = leftSide*rightSide;
                numberField.setText(Integer.toBinaryString(result));
                break;
        }
    }

    @FXML
    private void convertButtonClicked() {
        //runs when convertButton is clicked
        if (isDecimal){
            String decimal = numberField.getText();
            String integer = Integer.toBinaryString(Integer.parseInt(decimal));
            numberField.setText(integer);
            isDecimal=false;
        }else {
            String binary = numberField.getText();
            Integer integer = Integer.parseInt(binary, 2);
            numberField.setText(integer.toString());
            isDecimal=true;
        }
    }

}