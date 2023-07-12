package com.example.session1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class OrganizationItem implements Initializable {
    @FXML
    private Label description;

    @FXML
    private ImageView img;

    @FXML
    private Label title;

    public void setData(Organization organization){
        Image image = new Image(getClass().getResourceAsStream(organization.getImage()));
        img.setImage(image);
        title.setText(organization.getText());
        description.setText(organization.getDescription());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
