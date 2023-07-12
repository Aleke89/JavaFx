package com.example.session1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DBUtils {

    private static Connection connection;

    public static Connection getConnect() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/android", "root", "ernur2007");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static ObservableList<Organization> setOrganizationData() {
        ObservableList<Organization> organizationList = FXCollections.observableArrayList();

        try {
            Connection connection1 = getConnect();
            PreparedStatement preparedStatement = connection1.prepareStatement("SELECT * FROM charity");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Organization organization = new Organization();
                organization.setImage("/com/example/session1/"+resultSet.getString("CharityLogo"));
                organization.setText(resultSet.getString("CharityName"));
                organization.setDescription(resultSet.getString("CharityDescription"));
                organizationList.add(organization);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return organizationList;
    }


    public static String time() {

        LocalDateTime targetDateTime = LocalDateTime.of(2023, 11, 24, 6, 0);

        // Получаем текущую дату и время
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Вычисляем промежуток времени между текущей и целевой датами
        Duration duration = Duration.between(currentDateTime, targetDateTime);

        // Получаем количество дней, часов и минут в промежутке
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        String text = days + " дней " + hours + " часов и " + minutes + " минут до старта марафона!";
        return text;
    }
    public static ObservableList<Service> getServicesCheckPoint(){
        ObservableList<Service> services = FXCollections.observableArrayList();
        Connection connection1 = getConnect();
        try {
            PreparedStatement preparedStatement = connection1.prepareStatement("SELECT * FROM services");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Service service = new Service();
                boolean drinks = resultSet.getBoolean("drinks");
                boolean energy = resultSet.getBoolean("energy");
                boolean toilet = resultSet.getBoolean("toilet");
                boolean information = resultSet.getBoolean("information");
                boolean medical = resultSet.getBoolean("medical");
                service.setName(resultSet.getString("name"));
                service.setDrinks(drinks);
                service.setEnergy(energy);
                service.setMedical(medical);
                service.setDrinks(drinks);
                service.setToilets(toilet);
                service.setInformation(information);
                services.add(service);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return services;
    }
    public static ObservableList<Sponsor> getSponsors(TableView<Sponsor> tableView, TableColumn clm_logo, TableColumn clm_name, TableColumn clm_amount){
        ObservableList<Sponsor> sponsorObservableList = FXCollections.observableArrayList();
        Connection connection1 = getConnect();
        try {
            PreparedStatement preparedStatement = connection1.prepareStatement("SELECT * FROM sponsor");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                sponsorObservableList.add(new Sponsor("/com/example/session1/"+resultSet.getString("logo"),
                        resultSet.getString("name"),
                        resultSet.getString("amount")));
            }
            clm_logo.setCellValueFactory(new PropertyValueFactory<>("logo"));
            clm_name.setCellValueFactory(new PropertyValueFactory<>("name"));
            clm_amount.setCellValueFactory(new PropertyValueFactory<>("amount"));

            tableView.setItems(sponsorObservableList);

        }catch (Exception e){
            e.printStackTrace();
        }
        return sponsorObservableList;
    }
    public static ObservableList<Sponsor> getSponsorsObservable(){
        ObservableList<Sponsor> sponsorObservableList = FXCollections.observableArrayList();
        Connection connection1 = getConnect();
        try {
            PreparedStatement preparedStatement = connection1.prepareStatement("SELECT * FROM sponsor");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                sponsorObservableList.add(new Sponsor("/com/example/session1/"+resultSet.getString("logo"),
                        resultSet.getString("name"),
                        resultSet.getString("amount")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sponsorObservableList;
    }
}
