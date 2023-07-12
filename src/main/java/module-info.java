module com.example.session1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.example.session1 to javafx.fxml;
    exports com.example.session1;
}