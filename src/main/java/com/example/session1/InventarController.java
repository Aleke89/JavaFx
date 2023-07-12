package com.example.session1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class InventarController {

    @FXML
    private Button btn_log_out;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_otchet;

    @FXML
    private Button btn_postuplenie;

    @FXML
    private TableColumn<?, ?> clm_komplekt;

    @FXML
    private TableColumn<?, ?> clm_neobchodimo;

    @FXML
    private TableColumn<?, ?> clm_ostatok;

    @FXML
    private TableColumn<?, ?> clm_tip_A;

    @FXML
    private TableColumn<?, ?> clm_tip_B;

    @FXML
    private TableColumn<?, ?> clm_tip_C;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Text txt_number_registrated;

    @FXML
    private Label txt_time;

}
