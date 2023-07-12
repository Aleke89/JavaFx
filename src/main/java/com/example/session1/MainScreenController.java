package com.example.session1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    @FXML
    private Button btn_login;

    @FXML
    private Button btn_runner;

    @FXML
    private Button btn_sponsor;

    @FXML
    private Button btn_uznat;

    @FXML
    private Label txt_time;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txt_time.setText(DBUtils.time());
    }
}