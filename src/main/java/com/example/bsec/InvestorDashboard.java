package com.example.bsec;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InvestorDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void u1g5ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g5.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g5");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g6ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g6.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g6");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g2ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g2");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g1ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g1");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g7ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g7.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g7");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g3ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g3.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g3");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g8ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g8.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g8");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u1g4ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u1g4.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u1g4");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }
}