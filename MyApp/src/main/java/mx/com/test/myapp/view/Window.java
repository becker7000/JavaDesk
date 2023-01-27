package mx.com.test.myapp.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window extends Stage {

    public Window() {
        // Es un panel
        StackPane root = new StackPane();

        // Etiqueta desde javafx
        Label label = new Label("Escena por defecto JavaFX");

        // Agregamos la etiquet al panel
        root.getChildren().add(label);

        // Scene es una escena que se mostrará en el escenario
        // La clase Scene recibe el panel a mostrar y sus dimensiones
        Scene scene = new Scene(root,500,500);

        // Lanzamos la escena al escenario
        this.setScene(scene);

        // Le damos un título al escenario
        this.setTitle("Sin título");

        // Fijamos el tamaño de la ventana
        this.setResizable(false);

        // Fijamos un icono para el escenerio
        this.getIcons().add(new Image("user2.png"));

        // Se muestra
        this.show();

    }

    public Window(String titulo) {

        // Es un panel
        StackPane root = new StackPane();

        // Etiqueta desde javafx
        Label label = new Label("Hola desde otra escena JavaFX");

        // Agregamos la etiquet al panel
        root.getChildren().add(label);

        // Scene es una escena que se mostrará en el escenario
        // La clase Scene recibe el panel a mostrar y sus dimensiones
        Scene scene = new Scene(root,500,500);

        // Lanzamos la escena al escenario
        this.setScene(scene);

        // Le damos un título al escenario
        this.setTitle(titulo);

        // Fijamos el tamaño de la ventana
        this.setResizable(false);

        // Fijamos un icono para el escenerio
        this.getIcons().add(new Image("user2.png"));

        this.show();

    }

}
