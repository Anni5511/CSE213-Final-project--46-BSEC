package abdullah.investor;

import abdullah.HelloApplication;
import abdullah.modelclasses.WatchlistItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u1g7
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<WatchlistItem> watchlistTable;
    @javafx.fxml.FXML
    private TextField txtAddStock;
    @javafx.fxml.FXML
    private TableColumn<WatchlistItem, String> removeCol;
    @javafx.fxml.FXML
    private TableColumn<WatchlistItem, Integer> stocksymbolCol;
    @javafx.fxml.FXML
    private TableColumn<WatchlistItem, Integer> latestpriceCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addStockAction(ActionEvent actionEvent) {
        stocksymbolCol.setCellValueFactory(new PropertyValueFactory<>("symbol"));
        latestpriceCol.setCellValueFactory(new PropertyValueFactory<>("latestPrice"));
        removeCol.setCellValueFactory(new PropertyValueFactory<>("removeText"));
    }

    @javafx.fxml.FXML
    public void backDashboardAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InvestorDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("InvestorDashboard");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){

        }
    }
}