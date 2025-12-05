module com.example.ms3anni {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms3anni to javafx.fxml;
    exports com.example.ms3anni;
}