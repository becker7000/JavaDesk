package calculadoraIMC;

import calculadoraIMC.models.IMC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField textFieldMasa;
    private JTextField textFieldEstatura;
    private JLabel escribeTuMasaLabel;
    private JLabel escribeTuEstaturaLabel;
    private JTextArea textAreaInfo;
    private JButton calcularButton;
    private JPanel panelPrincipal;
    private JPanel panelChico;
    private double masa;
    private double estatura;

    public Calculadora(){
        super("Calcula tu IMC");
        setContentPane(panelPrincipal);
        comportamientoBoton();
    }

    public void comportamientoBoton(){
        ActionListener click = new ActionListener() {
            @Override // Sobreescribiendo el método actionPerformed
            public void actionPerformed(ActionEvent e) {

                // Obtenemos la masa
                masa = Double.parseDouble(textFieldMasa.getText());
                estatura = Double.parseDouble(textFieldEstatura.getText());

                // Creamos una instancia de IMC
                IMC imcUsuario = new IMC(masa,estatura);

                // Ajusatamos el texto del área de texto:
                textAreaInfo.setText(imcUsuario.generarDiagnostico());
            }

        }; // Nota: cuando definimos la sobreescritura de un método usamos ; al final

        // El comportamiento (ActionListener click) se le agrega pero al boton
        calcularButton.addActionListener(click);
    }

}
