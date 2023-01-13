import java.util.Scanner;

public class TestConsoleReciboCFE {

    // Punto de ejecución
    public static void main(String[] args) {

        // Entradas:
        Scanner entrada = new Scanner(System.in);
        double consumo;

        System.out.print("\n\t Escribe tu consumo: ");
        consumo=entrada.nextDouble(); entrada.nextLine(); // Cerramos la línea

        // Creamos una instancia de la clase ReciboCFE
        ReciboCFE reciboA = new ReciboCFE(consumo);

        // Mandamos el reporte a imprimir en consola (salidas):
        System.out.println(reciboA.generarReporte());

        // Cerramos el Scanner entrada
        entrada.close();

    }

}
