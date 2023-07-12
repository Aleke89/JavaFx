package com.example.session1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SponsorObzorController implements Initializable {

    @FXML
    private Button btn_log_out;

    @FXML
    private Button btn_nazad;

    @FXML
    private Button btn_sortirovka;

    @FXML
    private TableColumn<Sponsor, String> clm_amount;

    @FXML
    private TableColumn<Sponsor, String > clm_logotip;

    @FXML
    private TableColumn<Sponsor, String > clm_name;

    @FXML
    private TableView<Sponsor> table_view;

    @FXML
    private TextField txf_sortirovka;

    @FXML
    private Label txt_all_money_number;

    @FXML
    private Label txt_number_of_organizations;

    @FXML
    private Label txt_time;

    ObservableList<Sponsor> sponsorObservableList = FXCollections.observableArrayList();
    ObservableList<Sponsor> sponsorObservableListSortirovka = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DBUtils.getSponsors(table_view,clm_logotip,clm_name,clm_amount);
        sponsorObservableList.addAll(DBUtils.getSponsorsObservable());
        int amount = 0;
        for(int i =0;i<sponsorObservableList.size();i++){
            amount+=Integer.parseInt(sponsorObservableList.get(i).getAmount());
        }
        txt_number_of_organizations.setText(""+sponsorObservableList.size());
        txt_all_money_number.setText(""+amount);
        btn_sortirovka.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FilteredList<Sponsor> filteredList = new FilteredList<>(sponsorObservableList, b->true);
                txf_sortirovka.textProperty().addListener((observable,oldValue,newValue)->{
                    filteredList.setPredicate(searchModel->{
                        if(newValue.isEmpty() || newValue.isBlank()||newValue==null){
                            return true;
                        }
                        String searchKeyWord = newValue.toLowerCase();
                        if(searchModel.getAmount().toLowerCase().indexOf(searchKeyWord)>-1){
                            return true;
                        } else {
                            return false;
                        }
                    });
                });
                SortedList<Sponsor> sortedList = new SortedList<>(filteredList);
                sortedList.comparatorProperty().bind(table_view.comparatorProperty());
                table_view.setItems(sortedList);
            }
        });


    }
}
