package com.example.bsec;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class logincontroller
{
    @javafx.fxml.FXML
    private TextField passTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label ErrorMessagelabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        selectCombobox.getItems().addAll("Investor", "Broker");

    }

    @javafx.fxml.FXML
    public void NewAccountButtonONAction(ActionEvent actionEvent) {


}

    @javafx.fxml.FXML
    public void forgotpassButtonONAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButtonONAction(ActionEvent actionEvent) {

        String id = idTF.getText();
        String pass = passTF.getText();
        String user = selectCombobox.getValue();

        if (id.isEmpty() || pass.isEmpty() || user.isEmpty()) {
            ErrorMessagelabel.setText("Please fill all fields!");
            return;
        }

        // Simple login check (you can replace with DB check later)
        if (id.equals("123") && pass.equals("123") && user.equals("Investor")) {
            ErrorMessagelabel.setText("Login Successful!");

            // Load dashboard
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InvestorDashboard.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage nextStage = new Stage();
                nextStage.setTitle("InvestorDashboard");
                nextStage.setScene(scene);
                nextStage.show();
            }
            catch (Exception e){
            }

        }
        if (id.equals("123") && pass.equals("123") && user.equals("Broker")) {
            ErrorMessagelabel.setText("Login Successful!");

            // Load dashboard
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BrokerDashboard.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage nextStage = new Stage();
                nextStage.setTitle("BrokerDashboard");
                nextStage.setScene(scene);
                nextStage.show();
            }
            catch (Exception e){
            }

        }
        else {
            ErrorMessagelabel.setText("Wrong ID or Password!");
        }
    }
}