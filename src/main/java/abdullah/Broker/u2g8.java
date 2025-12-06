package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g8
{
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private Button btnSearch;
    @javafx.fxml.FXML
    private TextField txtSearch;
    @javafx.fxml.FXML
    private TableView<Client> searchResultsTable;
    @javafx.fxml.FXML
    private TableColumn<Client,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Client,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Client,String> emailCol;
    @javafx.fxml.FXML
    private TableColumn<Client,String> boidCol;

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        boidCol.setCellValueFactory(new PropertyValueFactory<>("boid"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void searchClientAction(ActionEvent actionEvent) {
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