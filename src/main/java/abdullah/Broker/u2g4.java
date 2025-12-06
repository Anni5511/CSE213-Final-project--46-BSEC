package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.CommissionReportItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g4
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private ComboBox<Integer> comboDateRange;
    @javafx.fxml.FXML
    private Button btnGenerate;
    @javafx.fxml.FXML
    private TableView<CommissionReportItem> commissionTable;
    @javafx.fxml.FXML
    private TableColumn<CommissionReportItem, String> commissionearnedCol;
    @javafx.fxml.FXML
    private TableColumn<CommissionReportItem, Integer> tradevalueCol;
    @javafx.fxml.FXML
    private TableColumn<CommissionReportItem, String> clientboidCol;

    @javafx.fxml.FXML
    public void initialize() {

        comboDateRange.getItems().addAll(7, 15, 30, 60, 90);

        clientboidCol.setCellValueFactory(new PropertyValueFactory<>("clientBoid"));
        tradevalueCol.setCellValueFactory(new PropertyValueFactory<>("tradeValue"));
        commissionearnedCol.setCellValueFactory(new PropertyValueFactory<>("commissionEarned"));

    }

    @javafx.fxml.FXML
    public void generateReportAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportPDFAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonAction(ActionEvent actionEvent) {
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