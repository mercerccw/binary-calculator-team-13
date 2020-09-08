package org.team13;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

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

}
