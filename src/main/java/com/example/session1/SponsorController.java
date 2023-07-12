package com.example.session1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class SponsorController implements Initializable {
    @FXML
    private Button btn_add;

    @FXML
    private Button btn_mines;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_otmena;

    @FXML
    private Button btn_zaplatit;

    @FXML
    private CheckBox chck_koshki;

    @FXML
    private ChoiceBox<?> chs_begun;

    @FXML
    private TextField txf_card;

    @FXML
    private TextField txf_card_number;

    @FXML
    private TextField txf_cvc;

    @FXML
    private TextField txf_month;

    @FXML
    private TextField txf_name;

    @FXML
    private TextField txf_price;

    @FXML
    private TextField txf_year;

    @FXML
    private Text txt_price;

    @FXML
    private Label txt_time;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
