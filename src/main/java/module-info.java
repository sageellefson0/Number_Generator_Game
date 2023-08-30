module com.example.numbergeneratorgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numbergeneratorgame to javafx.fxml;
    exports com.example.numbergeneratorgame;
}