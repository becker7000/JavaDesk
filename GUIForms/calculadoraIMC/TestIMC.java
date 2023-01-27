import javax.swing.*;

public class TestIMC {

    public static void main(String[] args) {

        double masa = Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("\n\t Escribe tu masa: ")));
        double estatura = Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("\n\t Escribe tu estatura: ")));

        IMC testIMC = new IMC(masa,estatura);

        System.out.println("\n\t "+testIMC.generarDiagnostico());

    }

}
