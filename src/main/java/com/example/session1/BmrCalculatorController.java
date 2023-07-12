package com.example.session1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class BmrCalculatorController implements Initializable {

    @FXML
    private Button btn_calories;

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
    private TextField txf_vozrast;

    @FXML
    private Text txt_average_active;

    @FXML
    private Text txt_average_activity_number;

    @FXML
    private Text txt_info;

    @FXML
    private Text txt_info1;

    @FXML
    private Text txt_info11;

    @FXML
    private Text txt_info111;

    @FXML
    private Text txt_max_active;

    @FXML
    private Text txt_max_active_number;

    @FXML
    private Text txt_power_active;

    @FXML
    private Text txt_power_active_number;

    @FXML
    private Text txt_result_bmr;

    @FXML
    private Text txt_sitting;

    @FXML
    private Text txt_sitting_number;

    @FXML
    private Text txt_small_active;

    @FXML
    private Text txt_small_active_number;

    @FXML
    private Label txt_time;

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
                double femaleConstant = 655;
                double maleConstant = 66;
                double weightMultiplier = 13.7;
                double heightMultiplier = 5;
                double ageMultiplier = 6.8;
                double bmr;
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                if (male.isSelected()) {
                    double rost = Double.parseDouble(txf_rost.getText());
                    double ves = Double.parseDouble(txf_ves.getText());
                    double vozrast = Double.parseDouble(txf_vozrast.getText());
                    bmr = maleConstant + (weightMultiplier * ves) + (heightMultiplier * rost) - (ageMultiplier * vozrast);
                    txt_result_bmr.setText(decimalFormat.format(bmr));
                    txt_average_activity_number.setText(decimalFormat.format(bmr * 1.2));
                    txt_max_active_number.setText(decimalFormat.format(bmr * 1.375));
                    txt_power_active_number.setText(decimalFormat.format(bmr * 1.55));
                    txt_sitting_number.setText(decimalFormat.format(bmr * 1.725));
                    txt_small_active_number.setText(decimalFormat.format(bmr * 1.9));
                } else if (female.isSelected()) {
                    double rost = Double.parseDouble(txf_rost.getText());
                    double ves = Double.parseDouble(txf_ves.getText());
                    double vozrast = Double.parseDouble(txf_vozrast.getText());
                    bmr = femaleConstant + (weightMultiplier * ves) + (heightMultiplier * rost) - (ageMultiplier * vozrast);
                    txt_result_bmr.setText(decimalFormat.format(bmr));
                    txt_average_activity_number.setText(decimalFormat.format(bmr * 1.2));
                    txt_max_active_number.setText(decimalFormat.format(bmr * 1.375));
                    txt_power_active_number.setText(decimalFormat.format(bmr * 1.55));
                    txt_sitting_number.setText(decimalFormat.format(bmr * 1.725));
                    txt_small_active_number.setText(decimalFormat.format(bmr * 1.9));
                }
            }
        });
        btn_otmena.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                male.setSelected(false);
                female.setSelected(false);
                txt_average_activity_number.setText("");
                txt_max_active_number.setText("");
                txt_power_active_number.setText("");
                txt_sitting_number.setText("");
                txt_small_active_number.setText("");
                txt_result_bmr.setText("");
                txf_rost.setText("");
                txf_ves.setText("");
                txf_vozrast.setText("");
                male.setVisible(true);
                male.setSelected(false);
                female.setVisible(true);
                female.setSelected(false);
                txt_average_active.setVisible(false);
                txt_average_activity_number.setVisible(false);
                txt_max_active.setVisible(false);
                txt_max_active_number.setVisible(false);
                txt_power_active.setVisible(false);
                txt_power_active_number.setVisible(false);
                txt_sitting.setVisible(false);
                txt_sitting_number.setVisible(false);
                txt_small_active.setVisible(false);
                txt_small_active_number.setVisible(false);
            }
        });
        btn_calories.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_average_active.setVisible(true);
                txt_average_activity_number.setVisible(true);
                txt_max_active.setVisible(true);
                txt_max_active_number.setVisible(true);
                txt_power_active.setVisible(true);
                txt_power_active_number.setVisible(true);
                txt_sitting.setVisible(true);
                txt_sitting_number.setVisible(true);
                txt_small_active.setVisible(true);
                txt_small_active_number.setVisible(true);
                FXMLLoader fxmlLoader = new FXMLLoader();
                try {
                    Parent root = fxmlLoader.load(getClass().getResource("bmr_dialog.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root,600,400);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
