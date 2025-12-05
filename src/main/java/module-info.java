module com.example.simulating_operations_of_bsec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_bsec to javafx.fxml;
    exports com.example.simulating_operations_of_bsec;
}