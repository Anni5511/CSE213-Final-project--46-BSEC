package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.DailyTradeReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g7
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<DailyTradeReport> dailyReportTable;
    @javafx.fxml.FXML
    private Button btnExport;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Button btnGenerate;
    @javafx.fxml.FXML
    private TableColumn<DailyTradeReport,Integer> totaltradesCol;
    @javafx.fxml.FXML
    private TableColumn<DailyTradeReport,Integer> totaltradevalueCol;

    @javafx.fxml.FXML
    public void initialize() {
        totaltradesCol.setCellValueFactory(new PropertyValueFactory<>("totalTrades"));
        totaltradevalueCol.setCellValueFactory(new PropertyValueFactory<>("totalTradeValue"));
    }

    @javafx.fxml.FXML
    public void generateReportAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportReportAction(ActionEvent actionEvent) {
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