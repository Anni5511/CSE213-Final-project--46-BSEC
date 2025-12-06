package com.example.bsec;

import com.example.bsec.modelclasses.Stock;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u1g4
{
    @javafx.fxml.FXML
    private ComboBox<Stock> comboOwnedStocks;
    @javafx.fxml.FXML
    private TextField txtQuantity;
    @javafx.fxml.FXML
    private TextField txtPrice;

    @javafx.fxml.FXML
    public void initialize() {
        comboOwnedStocks.getItems().addAll("GrameenPhone","robi","Bashundahara Ltd");
    }

    @javafx.fxml.FXML
    public void backDashboardAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InvestorDashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void placeSellOrderAction(ActionEvent actionEvent) {
        String price = txtPrice.getText();
        String quintity = txtQuantity.getText();
    }
}