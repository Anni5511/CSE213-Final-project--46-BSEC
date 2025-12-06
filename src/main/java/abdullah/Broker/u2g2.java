package abdullah.Broker;

import abdullah.HelloApplication;
import abdullah.modelclasses.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u2g2
{
    @javafx.fxml.FXML
    private TableView<Order> pendingOrdersTable;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableColumn<Order, String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<Order, String> stockCol;
    @javafx.fxml.FXML
    private TableColumn<Order, String> investornameCol;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<Order, String> orderidCol;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
        orderidCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        stockCol.setCellValueFactory(new PropertyValueFactory<>("stockName"));
        investornameCol.setCellValueFactory(new PropertyValueFactory<>("investorName"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @javafx.fxml.FXML
    public void executeTradeAction(ActionEvent actionEvent) {
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