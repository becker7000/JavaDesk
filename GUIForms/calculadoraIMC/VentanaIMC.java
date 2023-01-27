import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaIMC extends JFrame {

    private JPanel jPanelVentana;
    private JTextField textFieldMasa;
    private JTextField textFieldEstatura;
    private JButton buttonIMC;
    private JTextArea textAreaDiagnostico;
    private JLabel jLabelMasa ;
    private JLabel jLabelEstatura;
    private JButton limpiarDatosButton;

    public VentanaIMC(){
        super("Calculadora de IMC");
        setContentPane(jPanelVentana);
        comportamientoBoton();
        limpiarDatos();
    }

    private void comportamientoBoton() {

        ActionListener click = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Obtenemos los datos de los textField
                double masa = Double.parseDouble(textFieldMasa.getText());
                double estatura = Double.parseDouble(textFieldEstatura.getText());

                // Crear una instancia de la clase IMC
                IMC imcUsuario = new IMC(masa,estatura);

                // Ajustamos el texto del textArea con el String devuelto por generarDiagnostico
                textAreaDiagnostico.setText(imcUsuario.generarDiagnostico());

            }
        };

        // Agregamos la acción al botón
        buttonIMC.addActionListener(click);

    }

    public void limpiarDatos(){

        ActionListener click = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldMasa.setText("");
                textFieldEstatura.setText("");
                textAreaDiagnostico.setText("");
            }
        };

        limpiarDatosButton.addActionListener(click);

    }

}
