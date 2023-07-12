package com.example.session1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LitsOrganizationsController implements Initializable {

    @FXML
    private Button btn_nazad;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Text txt_person_info;

    @FXML
    private Text txt_person_info1;

    @FXML
    private Label txt_time;
    @FXML
    private VBox vBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Organization> organizationList = new ArrayList<>(DBUtils.setOrganizationData());
        for(int i = 0;i<organizationList.size();i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("organization_item.fxml"));
            try {
                HBox hBox = fxmlLoader.load();
                OrganizationItem organizationItem = fxmlLoader.getController();
                organizationItem.setData(organizationList.get(i));
                vBox.getChildren().add(hBox);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
