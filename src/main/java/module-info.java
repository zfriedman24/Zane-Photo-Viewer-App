module com.example.zanephotoviewerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zanephotoviewerapp to javafx.fxml;
    exports com.example.zanephotoviewerapp;
}