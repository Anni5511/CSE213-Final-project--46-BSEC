package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.ExecutedTrade;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;

public class u2g6
{
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<ExecutedTrade> executedTradesTable;
    @javafx.fxml.FXML
    private Button btnViewDetails;
    @javafx.fxml.FXML
    private TableColumn<ExecutedTrade,String> stockcodeCol;
    @javafx.fxml.FXML
    private TableColumn<ExecutedTrade,LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<ExecutedTrade,Integer> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<ExecutedTrade,String> tableidCol;
    @javafx.fxml.FXML
    private TableColumn<ExecutedTrade,Integer> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
        tableidCol.setCellValueFactory(new PropertyValueFactory<>("tradeId"));
        stockcodeCol.setCellValueFactory(new PropertyValueFactory<>("stockCode"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

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