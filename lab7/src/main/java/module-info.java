module com.example.lab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab7.picture to javafx.fxml;
    exports com.example.lab7.picture;
}