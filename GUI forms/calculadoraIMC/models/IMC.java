package calculadoraIMC.models;

public class IMC {

    private double masa;
    private double estatura;
    private double imc;
    private String diagnostico;

    public IMC(double masa, double estatura) {
        this.masa = masa;
        this.estatura = estatura;
        this.imc=masa/Math.pow(estatura,2);
    }

    public String generarDiagnostico(){

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("\n\t Tu índice de masa corporal es: "+String.format("%.2f",imc));
        if(imc>=18.5 && imc<25.0){
            mensaje.append("\n\t Tu IMC es normal");
        }
        return mensaje.toString();
    }

}
