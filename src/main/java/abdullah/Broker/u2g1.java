package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.Investor;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g1
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<Investor> pendingAccountsTable;
    @javafx.fxml.FXML
    private TableColumn<Investor, String> investornameCol;
    @javafx.fxml.FXML
    private TableColumn<Investor, String> nidnumberCol;
    @javafx.fxml.FXML
    private TableColumn<Investor, String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Investor, String> emailCol;

    @javafx.fxml.FXML
    public void initialize() {
        investornameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nidnumberCol.setCellValueFactory(new PropertyValueFactory<>("nid"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
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