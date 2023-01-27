package mx.com.test.myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mx.com.test.myapp.view.Window;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Stage es un escenario
        System.out.println("\n\t Pintando ventana JavaFX");

        // Es un panel
        // StackPane root = new StackPane();

        // Esto también es un panel
        Pane root = new Pane();

        // Etiqueta desde javafx
        Label label = new Label("Hola a todos desde JavaFX");

        // Ajustamos la locación de label
        label.setLayoutY(20);

        // Agregamos la etiquet al panel
        root.getChildren().add(label);

        // Otra etiqueta
        root.getChildren().add(new Label("Otro texto"));


        // Scene es una escena que se mostrará en el escenario
        // La clase Scene recibe el panel a mostrar y sus dimensiones
        Scene scene = new Scene(root,500,500);

        // Lanzamos la escena al escenario
        stage.setScene(scene);

        // Le damos un título al escenario
        stage.setTitle("Mi primera ventana con JavaFX");

        // Fijamos el tamaño de la ventana
        stage.setResizable(false);

        // Fijamos un icono para el escenerio
        stage.getIcons().add(new Image("user2.png"));

        stage.show();
        // Platform.exit(); ya no lo requerimos porque
        // se va a ejecutar al cerrar la ventana

        // -------------Crear la clase Window
        // Usando el primer constructor

        // Enviamos a éste escenario al frente
        // stage.toBack(); // Es como el Z-index

        // Creamos un escenario con nuestra clase Window
        // Window miVentana = new Window("Ventana 2");

    }

    @Override
    public void init() throws Exception {
        System.out.println("\n\t Iniciando ventana");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("\n\t Finalizando ventana");
    }
}
