package abdullah.investor;

import abdullah.HelloApplication;
import abdullah.modelclasses.PortfolioItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class u1g5
{
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableView<PortfolioItem> portfolioTable;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> currentpriceCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, String> stocknameCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, String> profitorlossCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableColumn<PortfolioItem, Integer> avgpriceCol;

    @javafx.fxml.FXML
    public void initialize() {
        stocknameCol.setCellValueFactory(new PropertyValueFactory<>("stockName"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        avgpriceCol.setCellValueFactory(new PropertyValueFactory<>("avgPrice"));
        currentpriceCol.setCellValueFactory(new PropertyValueFactory<>("currentPrice"));
        profitorlossCol.setCellValueFactory(new PropertyValueFactory<>("profitOrLoss"));



    }

    @javafx.fxml.FXML
    public void exportReportAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonAction(ActionEvent actionEvent) {
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