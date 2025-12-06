package abdullah.investor;

import abdullah.HelloApplication;
import abdullah.modelclasses.Stock;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.text.html.ListView;
import java.awt.event.ActionEvent;

public class u1g2
{
    @javafx.fxml.FXML
    private ListView historyList;
    @javafx.fxml.FXML
    private TableView<Stock> stockTable;
    @javafx.fxml.FXML
    private Label historyLabel;
    @javafx.fxml.FXML
    private TextField searchTF;
    @javafx.fxml.FXML
    private TableColumn<Stock,Integer> codeCol;
    @javafx.fxml.FXML
    private TableColumn<Stock,String> stocknameCol;
    @javafx.fxml.FXML
    private TableColumn<Stock,Integer> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
        codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
        stocknameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

    }

    @javafx.fxml.FXML
    public void searchButtonAction(ActionEvent actionEvent) {
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