package com.example.bsec;

import com.example.bsec.modelclasses.PortfolioItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u1g5
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<PortfolioItem> portfolioTable;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> currentpriceCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, String> stocknameCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, String> profitorlossCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> avgpriceCol;

    @javafx.fxml.FXML
    public void initialize() {
        stocknameCol.setCellValueFactory(new PropertyValueFactory<>("stockName"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        avgpriceCol.setCellValueFactory(new PropertyValueFactory<>("avgPrice"));
        currentpriceCol.setCellValueFactory(new PropertyValueFactory<>("currentPrice"));
        profitorlossCol.setCellValueFactory(new PropertyValueFactory<>("profitOrLoss"));



    }

    @javafx.fxml.FXML
    public void exportReportAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            lblMessage.setText("Failed to go back!");
            e.printStackTrace();
        }
    }
}