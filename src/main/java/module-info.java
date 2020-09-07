module org.team13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.team13 to javafx.fxml;
    exports org.team13;
}