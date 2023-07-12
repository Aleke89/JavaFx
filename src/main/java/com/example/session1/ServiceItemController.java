package com.example.session1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ServiceItemController{

    @FXML
    private ImageView img_service;

    @FXML
    private Label name_service;

    public void setData(Service service){
        if(service.getDrinks()){
            Image image = new Image(getClass().getResourceAsStream("/com/example/session1/map-icon-drinks.png"));
            img_service.setImage(image);
            name_service.setText("Drinks");
        } else if (service.getEnergy()) {
            Image image = new Image(getClass().getResourceAsStream("/com/example/session1/map-icon-energy-bars.png"));
            img_service.setImage(image);
        }else if (service.getInformation()){
            Image image = new Image(getClass().getResourceAsStream("/com/example/session1/map-icon-information.png"));
            img_service.setImage(image);
        }else if(service.getMedical()){
            Image image = new Image(getClass().getResourceAsStream("/com/example/session1/map-icon-medical.png"));
            img_service.setImage(image);
        }else if(service.getToilets()){
            Image image = new Image(getClass().getResourceAsStream("/com/example/session1/map-icon-toilets.png"));
            img_service.setImage(image);
        }


    }
}
