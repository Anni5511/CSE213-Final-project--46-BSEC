package abdullah.Broker;

import abdullah.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class u2g1
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView pendingAccountsTable;
    @javafx.fxml.FXML
    private TableColumn investornameCol;
    @javafx.fxml.FXML
    private TableColumn nidnumberCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn emailCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveAction(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void rejectAction(ActionEvent actionEvent) {
    }
}