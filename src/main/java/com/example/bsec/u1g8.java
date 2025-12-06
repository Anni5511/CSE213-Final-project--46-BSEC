package com.example.bsec;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class u1g8
{
    @javafx.fxml.FXML
    private TextField txtFilePath;
    @javafx.fxml.FXML
    private Button btnSubmitReport;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TextField txtYear;
    @javafx.fxml.FXML
    private Button btnBrowseFile;
    @javafx.fxml.FXML
    private TextField txtCompanyName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReportAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void browseFileAction(ActionEvent actionEvent) {
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