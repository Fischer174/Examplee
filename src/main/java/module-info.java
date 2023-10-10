module com.example.example_2branch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.example_2branch to javafx.fxml;
    exports com.example.example_2branch;
}