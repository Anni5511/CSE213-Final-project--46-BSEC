package abdullah.investor;

import abdullah.HelloApplication;
import abdullah.modelclasses.Stock;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
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

        //comboOwnedStocks.getItems().addAll("GrameenPhone","robi","Bashundahara Ltd");
    }

    @javafx.fxml.FXML
    public void backDashboardAction(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void placeSellOrderAction(ActionEvent actionEvent) {
        String price = txtPrice.getText();
        String quintity = txtQuantity.getText();
    }
}