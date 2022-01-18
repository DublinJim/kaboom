module com.example.kaboom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kaboom to javafx.fxml;
    exports com.example.kaboom;
}