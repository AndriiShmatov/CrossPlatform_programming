module com.example.lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab6.view to javafx.fxml;
    exports com.example.lab6;
}