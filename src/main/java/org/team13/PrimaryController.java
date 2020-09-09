package org.team13;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {
    @FXML
    private Label evaluatedAnswer;
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
            double sqrt = findSqrt(Double.parseDouble(numberField.getCharacters().toString()));
            System.out.println(sqrt);
            evaluatedAnswer.setText(Double.toString(sqrt));
        }
    }

    public double findSqrt(double n) {
        double left = 0;
        double right = n + 1;
        while(right - left >= 2) {
            double mid = (left + right) / 2;
            if(mid * mid <= n) left = mid;
            else right = mid;
        }
        return left;
    }

    @FXML
    private void equalClicked() {
        //runs when equalsButton is clicked

    }

    @FXML
    private void convertButtonClicked() {
        //runs when convertButton is clicked
    }

}
