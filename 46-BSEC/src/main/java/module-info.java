module com.example._6bsec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._6bsec to javafx.fxml;
    exports com.example._6bsec;
}