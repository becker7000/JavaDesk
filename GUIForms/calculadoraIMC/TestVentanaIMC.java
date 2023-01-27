import javax.swing.*;
import java.awt.*;

public class TestVentanaIMC {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaIMC calcIMC = new VentanaIMC();
                calcIMC.setSize(600,320);
                calcIMC.setMinimumSize(new Dimension(560,300));
                calcIMC.setLocationRelativeTo(null); // Centra la ventana
                calcIMC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                calcIMC.setVisible(true);
            }
        });

    }

}
