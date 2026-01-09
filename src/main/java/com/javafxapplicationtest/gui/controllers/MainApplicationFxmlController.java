package com.javafxapplicationtest.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainApplicationFxmlController {

    @FXML
    private TableColumn<?, ?> IdColumn;

    @FXML
    private TableView<?> InfoTable;

    @FXML
    private TableColumn<?, ?> NameColumn;

    @FXML
    private TableColumn<?, ?> RamColumn;

    @FXML
    private TableColumn<?, ?> TypeColumn;

    @FXML
    private Button addButton;

    @FXML
    private Button changeButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField nameField;

    @FXML
    private TextField ramField;

    @FXML
    private TextField typeField;

    @FXML
    void onAddButtonClicked(ActionEvent event) {

    }

    @FXML
    void onChangeButtonClicked(ActionEvent event) {

    }

    @FXML
    void onDeleteButtonClicked(ActionEvent event) {

    }

}
