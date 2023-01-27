package calculadoraIMC;

import javax.swing.*;

public class TestCalculadoraIMC {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculadora calcIMC = new Calculadora();
                calcIMC.setSize(500,500);
                calcIMC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                calcIMC.setVisible(true);
            }
        });

    }

}
