package com.example.bsec;

import com.example.bsec.modelclasses.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;

public class u1g6
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableView<Transaction> transactionTable;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> stockFilterCombo;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> stockCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<Transaction, Integer> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        stockCol.setCellValueFactory(new PropertyValueFactory<>("stockName"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @javafx.fxml.FXML
    public void exportPDFAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonAction(ActionEvent actionEvent) {
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
}