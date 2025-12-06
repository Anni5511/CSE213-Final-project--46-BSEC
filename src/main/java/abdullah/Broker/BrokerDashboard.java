package abdullah.Broker;

import abdullah.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BrokerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void u2g8ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g8.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g8");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g6ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g6.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g6");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g2ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g2");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g7ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g7.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g7");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g3ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g3.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g3");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g4ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g4.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g4");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g5ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g5.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g5");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }

    @javafx.fxml.FXML
    public void u2g1ActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("u2g1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("u2g1");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
        }
    }
}