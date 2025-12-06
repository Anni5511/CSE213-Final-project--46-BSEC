package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g5
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private Button btnApprove;
    @javafx.fxml.FXML
    private TableView<Client> clientRequestsTable;
    @javafx.fxml.FXML
    private Button btnViewDetails;
    @javafx.fxml.FXML
    private Button btnReject;
    @javafx.fxml.FXML
    private TextField txtRejectReason;
    @javafx.fxml.FXML
    private TableColumn<Client,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn documentsCol;
    @javafx.fxml.FXML
    private TableColumn<Client,String> boidCol;
    @javafx.fxml.FXML
    private TableColumn<Client,String> clientnameCol;

    @javafx.fxml.FXML
    public void initialize() {
        clientnameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        boidCol.setCellValueFactory(new PropertyValueFactory<>("boid"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        documentsCol.setCellValueFactory(new PropertyValueFactory<>("documents"));
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