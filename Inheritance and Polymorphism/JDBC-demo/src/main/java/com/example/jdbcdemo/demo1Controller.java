package com.example.jdbcdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class demo1Controller {
    @FXML
    private Button submit;
    @FXML
    private TextField name;
    @FXML
    private TableColumn<Person,Integer> tblid;
    @FXML
    private TableColumn<Person, String> tbllastname,tblfirstname,tblads,tblcity;
    @FXML
    private TableView tblview;



    public void btnShow(ActionEvent event) throws SQLException {
        String sqlread = "select * from persons";
        ResultSet resultSet = CRUD.read(sqlread);
        resultSet.absolute(Integer.parseInt(name.getText()));

        tblid.setCellValueFactory(new PropertyValueFactory<>("id"));
        tbllastname.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tblfirstname.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        tblads.setCellValueFactory(new PropertyValueFactory<>("address"));
        tblcity.setCellValueFactory(new PropertyValueFactory<>("city"));

        tblview.getItems().add(new Person(resultSet.getInt(1),resultSet.getString(2),
                resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));


    }
}
