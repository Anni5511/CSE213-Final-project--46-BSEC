package abdullah.Broker;

import abdullah.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class u2g4
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private ComboBox comboDateRange;
    @javafx.fxml.FXML
    private Button btnGenerate;
    @javafx.fxml.FXML
    private TableView commissionTable;
    @javafx.fxml.FXML
    private TableColumn commissionearnedCol;
    @javafx.fxml.FXML
    private TableColumn tradevalueCol;
    @javafx.fxml.FXML
    private TableColumn clientboidCol;

    @javafx.fxml.FXML
    public void initialize() {
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