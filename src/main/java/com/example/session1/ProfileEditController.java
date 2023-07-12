package com.example.session1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ProfileEditController {

    @FXML
    private Button btn_log_out;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_otmena;

    @FXML
    private Button btn_prosmotr;

    @FXML
    private Button btn_save;

    @FXML
    private ChoiceBox<?> chs_country;

    @FXML
    private ChoiceBox<?> chs_gender;

    @FXML
    private DatePicker dp_birth_date;

    @FXML
    private ImageView img;

    @FXML
    private TextField txf_name;

    @FXML
    private TextField txf_photo;

    @FXML
    private TextField txf_surname;

    @FXML
    private Text txt_email;

    @FXML
    private Label txt_time;

}
