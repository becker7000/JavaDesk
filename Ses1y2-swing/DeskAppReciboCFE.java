public class DeskAppReciboCFE {

    public static void main(String[] args) {

        VentanaReciboCFE ventana = new VentanaReciboCFE("Generador de reportes CFE",500,500);
        /*
        * Nota: Por defecto todas las ventanas JFrame cuando se crean son invisibles.
        * */

        // Debemos ajustar la propiedad visible en true para que se pueda ver.
        ventana.setVisible(true);

    }

}
