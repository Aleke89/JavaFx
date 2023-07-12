package com.example.session1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class RunnerRegistrationController {

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_otmena;

    @FXML
    private Button btn_prosmotr;

    @FXML
    private Button btn_registration;

    @FXML
    private ChoiceBox<?> chbx_country;

    @FXML
    private ChoiceBox<?> chbx_gender;

    @FXML
    private DatePicker dtp_birth_day;

    @FXML
    private ImageView img_prosmotr;

    @FXML
    private TextField txf_email;

    @FXML
    private TextField txf_image;

    @FXML
    private TextField txf_name;

    @FXML
    private TextField txf_password;

    @FXML
    private TextField txf_password_repeat;

    @FXML
    private TextField txf_surname;

    @FXML
    private Label txt_time;

}
