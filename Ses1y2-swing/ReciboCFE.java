public class ReciboCFE {

    // POJO: Plain Old Java Object
    // Atributos:
    private final double tarifa1 = 1.2;
    private final double tarifa2 = 1.5; // Atajo: (duplicar una línea) ctrl + d, cmd + D
    private final double tarifa3 = 1.8;
    private double consumo;

    // Constructor:
    public ReciboCFE(double consumo) {
        this.consumo = consumo;
    }

    // Método para generar un reporte de consumo
    public String generarReporte(){

        // Variable local:
        double tarifa = 0.0;
        double monto;

        // Asignamos la tarifa de acuerdo al consumo:
        if(consumo<800){
            tarifa=tarifa1;
        }else if(consumo>=800 && consumo<=1450){
            tarifa=tarifa2;
        }else{ // Opción para un consumo>1450
            tarifa=tarifa3;
        }

        // Calculamos el monto a pagar:
        monto=consumo*tarifa;

        // Generamos una cadena con la clase StringBuilder:
        StringBuilder reporte = new StringBuilder();

        reporte.append("\n\t +---------REPORTE----------+");
        reporte.append(String.format("\n\t | Consumo: %.2f kWh",consumo));
        reporte.append(String.format("\n\t | Tarifa: $%.2f por kWh",tarifa));
        reporte.append(String.format("\n\t | Monto: $%.2f",monto));
        reporte.append("\n\t +---------------------------------+");

        // toString() transforma a String el objeto reporte de la clase StringBuilder
        return reporte.toString();

    }

}

/*
*  1. Java desde cero (Java básico con POO)
*  2. Java Escritorio (Swing y JavaFX)
*  3. Java Web
*  4. Aplicaciones para Android con Kotlin
* */

/*
*   Ejercicios:
*
*   1. Crear una aplicación de escritorio que genere un reporte
*   de un ÍNDICE DE MASA CORPORAL. (Tendras que programar un POJO CalculadoraIMC(masa,estarura)
*
*   2. Crear una aplicación de escritorio tipo menú diferente
*   al siguiente ejemplo:
*
*   Existenten 3 botones:
*   Opción 1: WRX-STI (Subaru)
*   Opción 2: Roma (Ferrari)
*   Opción 3: Supra (Toyota)
*
*   Al darles click te muestra la información de cada automovil.
*   Para este ejemplo tendrías que programar un POJO Automovil(Marca,Modelo,Potencia,...)
*   Y tenga un método que visualize la información: mostrarAuto()
*
*   3. Hacer una aplicación de escritorio como tú quieras.
*
*   Nota: obligatorio usar lo que vimos con Swing
* */