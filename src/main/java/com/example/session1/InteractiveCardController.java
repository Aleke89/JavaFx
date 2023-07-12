package com.example.session1;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class InteractiveCardController implements Initializable {
    @FXML
    private VBox vBox;
    @FXML
    private AnchorPane anchor_pane_show;

    @FXML
    private Button btn_chk_1;

    @FXML
    private Button btn_chk_2;

    @FXML
    private Button btn_chk_3;

    @FXML
    private Button btn_chk_4;

    @FXML
    private Button btn_chk_5;

    @FXML
    private Button btn_chk_6;

    @FXML
    private Button btn_chk_7;

    @FXML
    private Button btn_chk_8;

    @FXML
    private Button btn_close_dialog;

    @FXML
    private Button btn_log_out;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_start_first;

    @FXML
    private Button btn_start_second;

    @FXML
    private Button btn_start_third;


    @FXML
    private Text txt_check_point;

    @FXML
    private Text txt_chk_name;

    @FXML
    private Label txt_time;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_start_first.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                show(anchor_pane_show,txt_chk_name,"Full Marathon",null);
                txt_check_point.setText("Race Start");
            }
        });
        btn_start_second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                show(anchor_pane_show,txt_chk_name,"Capoiera 5km Fun Run",null);
                txt_check_point.setText("Race Start");
            }
        });
        btn_start_third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                show(anchor_pane_show,txt_chk_name,"Jongo Half Marathon",null);
                txt_check_point.setText("Race Start");
            }
        });
        btn_close_dialog.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                anchor_pane_show.setVisible(false);
            }
        });
        btn_chk_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                show(anchor_pane_show,txt_check_point,"Checkpoint 1",DBUtils.getServicesCheckPoint());
            }
        });
        btn_chk_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });
        btn_chk_8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txt_chk_name.setText("Landmark Name");
            }
        });

    }

    private void show(AnchorPane anchor_pane_show, Text txt_chk_name, String text, ObservableList<Service> services) {
        anchor_pane_show.setVisible(true);
        txt_chk_name.setText(text);
        for(int i = 0;i<services.size();i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("service_item.fxml"));
            try {
                HBox hBox = fxmlLoader.load();
                ServiceItemController serviceItemController = fxmlLoader.getController();
                serviceItemController.setData(services.get(i));
                vBox.getChildren().add(hBox);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
