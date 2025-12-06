package com.example.bsec;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class u2g2
{
    @javafx.fxml.FXML
    private TableView pendingOrdersTable;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableColumn typeCol;
    @javafx.fxml.FXML
    private TableColumn stockCol;
    @javafx.fxml.FXML
    private TableColumn investornameCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TableColumn orderidCol;
    @javafx.fxml.FXML
    private TableColumn priceCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void executeTradeAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backDashboardAction(ActionEvent actionEvent) {
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
}