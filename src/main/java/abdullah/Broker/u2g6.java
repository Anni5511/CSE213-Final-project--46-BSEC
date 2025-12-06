package abdullah.Broker;

import abdullah.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class u2g6
{
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView executedTradesTable;
    @javafx.fxml.FXML
    private Button btnViewDetails;
    @javafx.fxml.FXML
    private TableColumn stockcodeCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TableColumn tableidCol;
    @javafx.fxml.FXML
    private TableColumn priceCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewDetailsAction(ActionEvent actionEvent) {
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