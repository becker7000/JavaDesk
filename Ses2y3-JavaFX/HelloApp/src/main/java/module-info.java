module mx.com.javaescritorio.helloapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens mx.com.javaescritorio.helloapp to javafx.fxml;
    exports mx.com.javaescritorio.helloapp;
}