package com.example.simulating_operations_of_bsec;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class controller
{
    @javafx.fxml.FXML
    private TableColumn TicketIDcol;
    @javafx.fxml.FXML
    private TableColumn Statuscol;
    @javafx.fxml.FXML
    private TableColumn CreatedDatecol;
    @javafx.fxml.FXML
    private ComboBox SelectStatuscombobox;
    @javafx.fxml.FXML
    private TableColumn Descriptioncol;
    @javafx.fxml.FXML
    private Button ClearFilterbutton;
    @javafx.fxml.FXML
    private Button BacktoHomebutton;
    @javafx.fxml.FXML
    private TableView ticketsTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBacktoHomebutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClearFilterbutton(ActionEvent actionEvent) {
    }
}