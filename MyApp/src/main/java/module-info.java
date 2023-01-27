module mx.com.test.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mx.com.test.myapp to javafx.fxml;
    exports mx.com.test.myapp;
}