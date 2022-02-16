package com.aptech;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


public class TableController {
    ObservableList<Person> list;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtaddress;

    @FXML
    private TableView<Person> tbl;
    @FXML
    private TableColumn<Person, Integer> id;

    @FXML
    private TableColumn<Person, String> name;

    @FXML
    private TableColumn<Person, String> address;

    @FXML
    private void initialize() {
        list = FXCollections.observableArrayList(
                new Person(1, "Ram", "Ktm"),
                new Person(2, "Sita", "Lalitpur"));


        id.setCellValueFactory(new PropertyValueFactory<Person, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        address.setCellValueFactory(new PropertyValueFactory<Person, String>("address"));

        tbl.setItems(list);


    }

    @FXML
    void getRowData(MouseEvent event) {
       Person p=tbl.getSelectionModel().getSelectedItem();
       txtname.setText(p.getName());
       txtaddress.setText(p.getAddress());
    }


}
