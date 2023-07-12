package com.example.session1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class BmiCalculatorController implements Initializable {

    @FXML
    private Button btn_log_out;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_otmena;

    @FXML
    private Button btn_rassshitat;

    @FXML
    private CheckBox female;

    @FXML
    private CheckBox male;

    @FXML
    private TextField txf_rost;

    @FXML
    private TextField txf_ves;

    @FXML
    private Text txt_info;

    @FXML
    private Label txt_izbitok;

    @FXML
    private Label txt_nedostatok;

    @FXML
    private Label txt_ozhirenie;

    @FXML
    private Label txt_result;

    @FXML
    private Label txt_result_color;

    @FXML
    private Label txt_time;

    @FXML
    private Label txt_zdorovyi;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        male.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                female.setVisible(false);
            }
        });
        female.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                male.setVisible(false);
            }
        });

        btn_rassshitat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double rost = Double.parseDouble(txf_rost.getText());
                double ves = Double.parseDouble(txf_ves.getText());
                double rostQ = rost/100*rost/100;
                double result = ves/rostQ;
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                if(result<=18.5){

                    txt_nedostatok.setText(""+decimalFormat.format(result));
                    txt_nedostatok.setVisible(true);
                    txt_zdorovyi.setVisible(false);
                    txt_izbitok.setVisible(false);
                    txt_ozhirenie.setVisible(false);
                    txt_result.setVisible(true);
                    txt_result_color.setVisible(true);
                    txt_result.setText("Недостаточный");
                    txt_result_color.setStyle("-fx-background-color:#ff9000");
                }else if(result>=18.5&&result<=24.9){
                    txt_zdorovyi.setVisible(true);
                    txt_zdorovyi.setText(""+decimalFormat.format(result));
                    txt_nedostatok.setVisible(false);
                    txt_izbitok.setVisible(false);
                    txt_ozhirenie.setVisible(false);
                    txt_result.setVisible(true);
                    txt_result_color.setVisible(true);
                    txt_result.setText("Здоровый");
                    txt_result_color.setStyle("-fx-background-color:#04ff00");
                } else if (result>=25 && result<=29.9) {
                    txt_izbitok.setText(""+decimalFormat.format(result));
                    txt_izbitok.setVisible(true);
                    txt_result.setVisible(true);
                    txt_result_color.setVisible(true);
                    txt_nedostatok.setVisible(false);
                    txt_zdorovyi.setVisible(false);
                    txt_ozhirenie.setVisible(false);
                    txt_result.setText("Избыточный");
                    txt_result_color.setStyle("-fx-background-color:#ff9000");
                }else {
                    txt_ozhirenie.setVisible(true);
                    txt_ozhirenie.setText(""+decimalFormat.format(result));
                    txt_nedostatok.setVisible(false);
                    txt_result.setVisible(true);
                    txt_result_color.setVisible(true);
                    txt_zdorovyi.setVisible(false);
                    txt_izbitok.setVisible(false);
                    txt_result.setText("Ожирение");
                    txt_result_color.setStyle("-fx-background-color:red");
                }
            }
        });
        btn_otmena.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txf_rost.setText("");
                txf_ves.setText("");
                male.setVisible(true);
                male.setSelected(false);
                female.setVisible(true);
                female.setSelected(false);
            }
        });

    }
}
